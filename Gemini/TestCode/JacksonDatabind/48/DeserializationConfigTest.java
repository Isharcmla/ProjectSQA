package com.fasterxml.jackson.databind;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class DeserializationConfigTest {

    private ObjectMapper _mapper;
    private DeserializationConfig _config;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
    static class PolymorphicBean {
        public int id;
    }

    static class SimpleBean {
        public String name;
        public SimpleBean() {}
        public SimpleBean(String n) { this.name = n; }
        public void setName(String n) { this.name = n; }
    }

    static class BuilderBean {
        public int x;
    }

    static class TestBuilder {
        public BuilderBean build() { return new BuilderBean(); }
    }

    private enum DummyFormatFeature implements FormatFeature {
        FEAT_1(true),
        FEAT_2(false);

        private final boolean _defaultState;
        DummyFormatFeature(boolean defaultState) { _defaultState = defaultState; }
        @Override public boolean enabledByDefault() { return _defaultState; }
        @Override public int getMask() { return (1 << ordinal()); }
        @Override public boolean enabledIn(int flags) { return (flags & getMask()) != 0; }
    }

    @Before
    public void setUp() {
        _mapper = new ObjectMapper();
        _config = _mapper.getDeserializationConfig();
    }

    @Test
    public void testConstructor_standardInstantiation_initializedProperly() {
        BaseSettings base = _config.getBaseSettings();
        SubtypeResolver str = new StdSubtypeResolver();
        SimpleMixInResolver mixins = new SimpleMixInResolver(null);
        RootNameLookup rootNames = new RootNameLookup();

        DeserializationConfig cfg = new DeserializationConfig(base, str, mixins, rootNames);
        Assert.assertNotNull(cfg.getNodeFactory());
        Assert.assertNull(cfg.getProblemHandlers());
        Assert.assertTrue(cfg.getDeserializationFeatures() > 0);
    }

    @Test
    public void testSerialization_roundTrip_equalsState() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(_config);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DeserializationConfig result = (DeserializationConfig) ois.readObject();
        ois.close();

        Assert.assertNotNull(result);
        Assert.assertEquals(_config.getDeserializationFeatures(), result.getDeserializationFeatures());
    }

    @Test
    public void testWithMapperFeatures_singleAndMultiple_stateChangedOrUnchanged() {
        DeserializationConfig same = _config.with(new MapperFeature[0]);
        Assert.assertSame(_config, same);

        DeserializationConfig updated = _config.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        Assert.assertNotSame(_config, updated);
        Assert.assertTrue(updated.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));

        DeserializationConfig sameAgain = updated.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        Assert.assertSame(updated, sameAgain);

        DeserializationConfig multi = _config.with(
                MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES,
                MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS
        );
        Assert.assertTrue(multi.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        Assert.assertTrue(multi.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS));
    }

    @Test
    public void testWithoutMapperFeatures_stateChangedOrUnchanged() {
        DeserializationConfig same = _config.without(new MapperFeature[0]);
        Assert.assertSame(_config, same);

        DeserializationConfig updated = _config.without(MapperFeature.AUTO_DETECT_FIELDS);
        Assert.assertNotSame(_config, updated);
        Assert.assertFalse(updated.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));

        DeserializationConfig sameAgain = updated.without(MapperFeature.AUTO_DETECT_FIELDS);
        Assert.assertSame(updated, sameAgain);

        DeserializationConfig multi = _config.without(
                MapperFeature.AUTO_DETECT_FIELDS,
                MapperFeature.AUTO_DETECT_GETTERS
        );
        Assert.assertFalse(multi.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        Assert.assertFalse(multi.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));
    }

    @Test
    public void testWithMapperFeatureExplicitState_toggleStates() {
        DeserializationConfig enabled = _config.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        Assert.assertTrue(enabled.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));

        DeserializationConfig sameEnabled = enabled.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        Assert.assertSame(enabled, sameEnabled);

        DeserializationConfig disabled = enabled.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, false);
        Assert.assertFalse(disabled.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));

        DeserializationConfig sameDisabled = disabled.with(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, false);
        Assert.assertSame(disabled, sameDisabled);
    }

    @Test
    public void testWithClassIntrospector_differentAndSame() {
        ClassIntrospector ci = _config.getClassIntrospector();
        Assert.assertSame(_config, _config.with(ci));

        ClassIntrospector newCi = new BasicClassIntrospector();
        DeserializationConfig cfg = _config.with(newCi);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(newCi, cfg.getClassIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospector_differentAndSame() {
        AnnotationIntrospector ai = _config.getAnnotationIntrospector();
        Assert.assertSame(_config, _config.with(ai));

        AnnotationIntrospector newAi = new JacksonAnnotationIntrospector();
        DeserializationConfig cfg = _config.with(newAi);
        Assert.assertNotSame(_config, cfg);
    }

    @Test
    public void testWithVisibilityChecker_differentAndSame() {
        VisibilityChecker<?> vc = _config.getDefaultVisibilityChecker();
        Assert.assertSame(_config, _config.with(vc));

        VisibilityChecker<?> newVc = VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY);
        DeserializationConfig cfg = _config.with(newVc);
        Assert.assertNotSame(_config, cfg);
    }

    @Test
    public void testWithVisibility_propertyAccessor() {
        DeserializationConfig cfg = _config.withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE);
        Assert.assertNotSame(_config, cfg);
    }

    @Test
    public void testWithTypeResolverBuilder_differentAndSame() {
        TypeResolverBuilder<?> trb = new StdTypeResolverBuilder();
        DeserializationConfig cfg = _config.with(trb);
        Assert.assertNotSame(_config, cfg);
    }

    @Test
    public void testWithSubtypeResolver_differentAndSame() {
        SubtypeResolver str = _config.getSubtypeResolver();
        Assert.assertSame(_config, _config.with(str));

        SubtypeResolver newStr = new StdSubtypeResolver();
        DeserializationConfig cfg = _config.with(newStr);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(newStr, cfg.getSubtypeResolver());
    }

    @Test
    public void testWithPropertyNamingStrategy_differentAndSame() {
        PropertyNamingStrategy pns = _config.getPropertyNamingStrategy();
        Assert.assertSame(_config, _config.with(pns));

        DeserializationConfig cfg = _config.with(PropertyNamingStrategy.SNAKE_CASE);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(PropertyNamingStrategy.SNAKE_CASE, cfg.getPropertyNamingStrategy());
    }

    @Test
    public void testWithRootName_nullEmptyAndCustom() {
        Assert.assertSame(_config, _config.withRootName((PropertyName) null));

        PropertyName pn1 = PropertyName.construct("root");
        DeserializationConfig cfg1 = _config.withRootName(pn1);
        Assert.assertNotSame(_config, cfg1);
        Assert.assertEquals(pn1, cfg1.getFullRootName());
        Assert.assertSame(cfg1, cfg1.withRootName(pn1));

        PropertyName pnEmpty = PropertyName.construct("");
        DeserializationConfig cfgEmpty = _config.withRootName(pnEmpty);
        Assert.assertNotSame(_config, cfgEmpty);

        DeserializationConfig cfgNullAgain = cfg1.withRootName((PropertyName) null);
        Assert.assertNotSame(cfg1, cfgNullAgain);
        Assert.assertNull(cfgNullAgain.getFullRootName());
    }

    @Test
    public void testWithTypeFactory_differentAndSame() {
        TypeFactory tf = _config.getTypeFactory();
        Assert.assertSame(_config, _config.with(tf));

        TypeFactory newTf = TypeFactory.defaultInstance().withModifier(null);
        DeserializationConfig cfg = _config.with(newTf);
        Assert.assertNotNull(cfg);
    }

    @Test
    public void testWithDateFormat_differentAndSame() {
        DateFormat df = _config.getDateFormat();
        Assert.assertSame(_config, _config.with(df));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        DeserializationConfig cfg = _config.with(sdf);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(sdf, cfg.getDateFormat());
    }

    @Test
    public void testWithHandlerInstantiator_differentAndSame() {
        HandlerInstantiator hi = _config.getHandlerInstantiator();
        Assert.assertSame(_config, _config.with(hi));

        HandlerInstantiator dummyHi = new HandlerInstantiator() {
            @Override public com.fasterxml.jackson.databind.JsonSerializer<?> serializerInstance(SerializationConfig c, com.fasterxml.jackson.databind.introspect.Annotated a, Class<?> k) { return null; }
            @Override public com.fasterxml.jackson.databind.JsonDeserializer<?> deserializerInstance(DeserializationConfig c, com.fasterxml.jackson.databind.introspect.Annotated a, Class<?> k) { return null; }
            @Override public com.fasterxml.jackson.databind.KeyDeserializer keyDeserializerInstance(DeserializationConfig c, com.fasterxml.jackson.databind.introspect.Annotated a, Class<?> k) { return null; }
            @Override public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> c, com.fasterxml.jackson.databind.introspect.Annotated a, Class<?> k) { return null; }
            @Override public TypeIdResolver typeIdResolverInstance(MapperConfig<?> c, com.fasterxml.jackson.databind.introspect.Annotated a, Class<?> k) { return null; }
        };
        DeserializationConfig cfg = _config.with(dummyHi);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(dummyHi, cfg.getHandlerInstantiator());
    }

    @Test
    public void testWithAnnotationIntrospectors_insertedAndAppended() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        DeserializationConfig cfgInserted = _config.withInsertedAnnotationIntrospector(ai);
        Assert.assertNotSame(_config, cfgInserted);

        DeserializationConfig cfgAppended = _config.withAppendedAnnotationIntrospector(ai);
        Assert.assertNotSame(_config, cfgAppended);
    }

    @Test
    public void testWithView_viewSetting() {
        Assert.assertNull(_config.getActiveView());
        Assert.assertSame(_config, _config.withView(null));

        DeserializationConfig cfg = _config.withView(String.class);
        Assert.assertNotSame(_config, cfg);
        Assert.assertEquals(String.class, cfg.getActiveView());
        Assert.assertSame(cfg, cfg.withView(String.class));

        DeserializationConfig cfgNull = cfg.withView(null);
        Assert.assertNotSame(cfg, cfgNull);
        Assert.assertNull(cfgNull.getActiveView());
    }

    @Test
    public void testWithLocale_differentAndSame() {
        Locale l = _config.getLocale();
        Assert.assertSame(_config, _config.with(l));

        DeserializationConfig cfg = _config.with(Locale.FRENCH);
        Assert.assertNotSame(_config, cfg);
        Assert.assertEquals(Locale.FRENCH, cfg.getLocale());
    }

    @Test
    public void testWithTimeZone_differentAndSame() {
        TimeZone tz = _config.getTimeZone();
        Assert.assertSame(_config, _config.with(tz));

        TimeZone newTz = TimeZone.getTimeZone("GMT+7");
        DeserializationConfig cfg = _config.with(newTz);
        Assert.assertNotSame(_config, cfg);
        Assert.assertEquals(newTz, cfg.getTimeZone());
    }

    @Test
    public void testWithBase64Variant_differentAndSame() {
        Base64Variant bv = _config.getBase64Variant();
        Assert.assertSame(_config, _config.with(bv));

        DeserializationConfig cfg = _config.with(Base64Variants.MODIFIED_FOR_URL);
        Assert.assertNotSame(_config, cfg);
        Assert.assertEquals(Base64Variants.MODIFIED_FOR_URL, cfg.getBase64Variant());
    }

    @Test
    public void testWithContextAttributes_differentAndSame() {
        ContextAttributes attrs = _config.getAttributes();
        Assert.assertSame(_config, _config.with(attrs));

        ContextAttributes newAttrs = ContextAttributes.getEmpty().withSharedAttribute("key", "val");
        DeserializationConfig cfg = _config.with(newAttrs);
        Assert.assertNotSame(_config, cfg);
        Assert.assertEquals("val", cfg.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithDeserializationFeature_single() {
        DeserializationConfig cfgDisabled = _config.without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        DeserializationConfig cfgEnabled = cfgDisabled.with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertTrue(cfgEnabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertSame(cfgEnabled, cfgEnabled.with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
    }

    @Test
    public void testWithDeserializationFeature_varargs() {
        DeserializationConfig cfgDisabled = _config
                .without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .without(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        DeserializationConfig cfgEnabled = cfgDisabled.with(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        );
        Assert.assertTrue(cfgEnabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertTrue(cfgEnabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertSame(cfgEnabled, cfgEnabled.with(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        ));
    }

    @Test
    public void testWithFeatures_deserializationFeatureArray() {
        DeserializationConfig same = _config.withFeatures();
        Assert.assertSame(_config, same);

        DeserializationConfig cfgDisabled = _config
                .without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .without(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        DeserializationConfig cfgEnabled = cfgDisabled.withFeatures(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        );
        Assert.assertTrue(cfgEnabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertTrue(cfgEnabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertSame(cfgEnabled, cfgEnabled.withFeatures(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        ));
    }

    @Test
    public void testWithoutDeserializationFeature_single() {
        DeserializationConfig cfgEnabled = _config.with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        DeserializationConfig cfgDisabled = cfgEnabled.without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertSame(cfgDisabled, cfgDisabled.without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
    }

    @Test
    public void testWithoutDeserializationFeature_varargs() {
        DeserializationConfig cfgEnabled = _config
                .with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        DeserializationConfig cfgDisabled = cfgEnabled.without(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        );
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertSame(cfgDisabled, cfgDisabled.without(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        ));
    }

    @Test
    public void testWithoutFeatures_deserializationFeatureArray() {
        DeserializationConfig same = _config.withoutFeatures();
        Assert.assertSame(_config, same);

        DeserializationConfig cfgEnabled = _config
                .with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
                .with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        DeserializationConfig cfgDisabled = cfgEnabled.withoutFeatures(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        );
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertFalse(cfgDisabled.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertSame(cfgDisabled, cfgDisabled.withoutFeatures(
                DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT,
                DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
        ));
    }

    @Test
    public void testJsonParserFeatures_withAndWithout() {
        JsonFactory jf = new JsonFactory();

        Assert.assertFalse(_config.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, jf));

        DeserializationConfig cfgWith = _config.with(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertNotSame(_config, cfgWith);
        Assert.assertTrue(cfgWith.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, jf));
        Assert.assertSame(cfgWith, cfgWith.with(JsonParser.Feature.ALLOW_COMMENTS));

        DeserializationConfig cfgWithFeatures = _config.withFeatures(
                JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
        );
        Assert.assertTrue(cfgWithFeatures.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, jf));
        Assert.assertTrue(cfgWithFeatures.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, jf));
        Assert.assertSame(cfgWithFeatures, cfgWithFeatures.withFeatures(
                JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
        ));

        DeserializationConfig cfgWithout = cfgWith.without(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertNotSame(cfgWith, cfgWithout);
        Assert.assertFalse(cfgWithout.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, jf));
        Assert.assertSame(cfgWithout, cfgWithout.without(JsonParser.Feature.ALLOW_COMMENTS));

        DeserializationConfig cfgWithoutFeatures = cfgWithFeatures.withoutFeatures(
                JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
        );
        Assert.assertFalse(cfgWithoutFeatures.isEnabled(JsonParser.Feature.ALLOW_COMMENTS, jf));
        Assert.assertFalse(cfgWithoutFeatures.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, jf));
        Assert.assertSame(cfgWithoutFeatures, cfgWithoutFeatures.withoutFeatures(
                JsonParser.Feature.ALLOW_COMMENTS,
                JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
        ));
    }

    @Test
    public void testFormatFeatures_withAndWithout() {
        DeserializationConfig cfgWith = _config.with(DummyFormatFeature.FEAT_1);
        Assert.assertNotSame(_config, cfgWith);
        Assert.assertSame(cfgWith, cfgWith.with(DummyFormatFeature.FEAT_1));

        DeserializationConfig cfgWithFeatures = _config.withFeatures(
                DummyFormatFeature.FEAT_1,
                DummyFormatFeature.FEAT_2
        );
        Assert.assertNotSame(_config, cfgWithFeatures);
        Assert.assertSame(cfgWithFeatures, cfgWithFeatures.withFeatures(
                DummyFormatFeature.FEAT_1,
                DummyFormatFeature.FEAT_2
        ));

        DeserializationConfig cfgWithout = cfgWith.without(DummyFormatFeature.FEAT_1);
        Assert.assertNotSame(cfgWith, cfgWithout);
        Assert.assertSame(cfgWithout, cfgWithout.without(DummyFormatFeature.FEAT_1));

        DeserializationConfig cfgWithoutFeatures = cfgWithFeatures.withoutFeatures(
                DummyFormatFeature.FEAT_1,
                DummyFormatFeature.FEAT_2
        );
        Assert.assertNotSame(cfgWithFeatures, cfgWithoutFeatures);
        Assert.assertSame(cfgWithoutFeatures, cfgWithoutFeatures.withoutFeatures(
                DummyFormatFeature.FEAT_1,
                DummyFormatFeature.FEAT_2
        ));
    }

    @Test
    public void testWithJsonNodeFactory_differentAndSame() {
        JsonNodeFactory jnf = _config.getNodeFactory();
        Assert.assertSame(_config, _config.with(jnf));

        JsonNodeFactory newJnf = new JsonNodeFactory(true);
        DeserializationConfig cfg = _config.with(newJnf);
        Assert.assertNotSame(_config, cfg);
        Assert.assertSame(newJnf, cfg.getNodeFactory());
    }

    @Test
    public void testProblemHandlers_addAndClear() {
        Assert.assertNull(_config.getProblemHandlers());
        Assert.assertSame(_config, _config.withNoProblemHandlers());

        DeserializationProblemHandler handler1 = new DeserializationProblemHandler() {};
        DeserializationProblemHandler handler2 = new DeserializationProblemHandler() {};

        DeserializationConfig cfg1 = _config.withHandler(handler1);
        Assert.assertNotSame(_config, cfg1);
        Assert.assertNotNull(cfg1.getProblemHandlers());
        Assert.assertSame(handler1, cfg1.getProblemHandlers().value());

        // Duplicate handler should not create a new config instance
        Assert.assertSame(cfg1, cfg1.withHandler(handler1));

        DeserializationConfig cfg2 = cfg1.withHandler(handler2);
        Assert.assertNotSame(cfg1, cfg2);
        LinkedNode<DeserializationProblemHandler> list = cfg2.getProblemHandlers();
        Assert.assertSame(handler2, list.value());
        Assert.assertSame(handler1, list.next().value());

        DeserializationConfig cfgCleared = cfg2.withNoProblemHandlers();
        Assert.assertNotSame(cfg2, cfgCleared);
        Assert.assertNull(cfgCleared.getProblemHandlers());
    }

    @Test
    public void testInitialize_jsonParserOverrides() throws Exception {
        JsonFactory jf = new JsonFactory();
        JsonParser p = jf.createParser("{\"a\":1}");

        // Unconfigured overrides - initialize should be no-op
        _config.initialize(p);

        // Configured overrides for ParserFeatures & FormatFeatures
        DeserializationConfig cfg = _config
                .with(JsonParser.Feature.ALLOW_COMMENTS)
                .with(DummyFormatFeature.FEAT_1);
        cfg.initialize(p);

        p.close();
    }

    @Test
    public void testGetAnnotationIntrospector_enabledAndDisabledAnnotations() {
        Assert.assertTrue(_config.isEnabled(MapperFeature.USE_ANNOTATIONS));
        Assert.assertNotNull(_config.getAnnotationIntrospector());
        Assert.assertFalse(_config.getAnnotationIntrospector() instanceof NopAnnotationIntrospector);

        DeserializationConfig cfgNoAnn = _config.without(MapperFeature.USE_ANNOTATIONS);
        Assert.assertSame(NopAnnotationIntrospector.instance, cfgNoAnn.getAnnotationIntrospector());
    }

    @Test
    public void testGetDefaultVisibilityChecker_withFeatureVariations() {
        VisibilityChecker<?> vcDefault = _config.getDefaultVisibilityChecker();
        Assert.assertNotNull(vcDefault);

        DeserializationConfig cfgDisabled = _config
                .without(MapperFeature.AUTO_DETECT_SETTERS)
                .without(MapperFeature.AUTO_DETECT_CREATORS)
                .without(MapperFeature.AUTO_DETECT_FIELDS);

        VisibilityChecker<?> vcDisabled = cfgDisabled.getDefaultVisibilityChecker();
        Assert.assertNotNull(vcDisabled);
    }

    @Test
    public void testIntrospectClassAnnotations_returnsValidDescription() {
        JavaType type = _config.constructType(SimpleBean.class);
        BeanDescription desc = _config.introspectClassAnnotations(type);
        Assert.assertNotNull(desc);
        Assert.assertEquals(SimpleBean.class, desc.getBeanClass());
    }

    @Test
    public void testIntrospectDirectClassAnnotations_returnsValidDescription() {
        JavaType type = _config.constructType(SimpleBean.class);
        BeanDescription desc = _config.introspectDirectClassAnnotations(type);
        Assert.assertNotNull(desc);
        Assert.assertEquals(SimpleBean.class, desc.getBeanClass());
    }

    @Test
    public void testIntrospect_introspectForCreation_introspectForBuilder() {
        JavaType type = _config.constructType(SimpleBean.class);

        BeanDescription desc = _config.introspect(type);
        Assert.assertNotNull(desc);

        BeanDescription descCreation = _config.introspectForCreation(type);
        Assert.assertNotNull(descCreation);

        JavaType builderType = _config.constructType(TestBuilder.class);
        BeanDescription descBuilder = _config.introspectForBuilder(builderType);
        Assert.assertNotNull(descBuilder);
    }

    @Test
    public void testDefaultPropertyInclusionAndFormat_defaults() {
        JsonInclude.Value inc = _config.getDefaultPropertyInclusion();
        Assert.assertNotNull(inc);
        Assert.assertSame(JsonInclude.Value.empty(), inc);

        JsonInclude.Value incByType = _config.getDefaultPropertyInclusion(SimpleBean.class);
        Assert.assertSame(JsonInclude.Value.empty(), incByType);

        JsonFormat.Value fmt = _config.getDefaultPropertyFormat(SimpleBean.class);
        Assert.assertSame(JsonFormat.Value.empty(), fmt);
    }

    @Test
    public void testUseRootWrapping_conditions() {
        DeserializationConfig cfg = _config.without(DeserializationFeature.UNWRAP_ROOT_VALUE);
        Assert.assertFalse(cfg.useRootWrapping());

        cfg = cfg.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        Assert.assertTrue(cfg.useRootWrapping());

        // Empty root name disables root wrapping
        DeserializationConfig cfgEmptyRoot = cfg.withRootName(PropertyName.construct(""));
        Assert.assertFalse(cfgEmptyRoot.useRootWrapping());

        // Non-empty root name enables root wrapping
        DeserializationConfig cfgNamedRoot = _config
                .without(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName(PropertyName.construct("MyRoot"));
        Assert.assertTrue(cfgNamedRoot.useRootWrapping());
    }

    @Test
    public void testFeatureMasks_hasDeserializationFeatures_hasSomeOfFeatures() {
        int mask1 = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES.getMask();
        int mask2 = DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT.getMask();

        DeserializationConfig cfg = _config
                .with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .without(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        Assert.assertTrue(cfg.hasDeserializationFeatures(mask1));
        Assert.assertFalse(cfg.hasDeserializationFeatures(mask1 | mask2));

        Assert.assertTrue(cfg.hasSomeOfFeatures(mask1 | mask2));
        Assert.assertFalse(cfg.hasSomeOfFeatures(mask2));
    }

    @Test
    public void testFindTypeDeserializer_polymorphicAndNonPolymorphic() throws Exception {
        JavaType nonPolyType = _config.constructType(SimpleBean.class);
        TypeDeserializer tdNonPoly = _config.findTypeDeserializer(nonPolyType);
        Assert.assertNull(tdNonPoly);

        JavaType polyType = _config.constructType(PolymorphicBean.class);
        TypeDeserializer tdPoly = _config.findTypeDeserializer(polyType);
        Assert.assertNotNull(tdPoly);
    }

    @Test
    public void testFindTypeDeserializer_withDefaultTyper() throws Exception {
        StdTypeResolverBuilder typer = new StdTypeResolverBuilder();
        typer.init(JsonTypeInfo.Id.CLASS, null);
        typer.inclusion(JsonTypeInfo.As.PROPERTY);

        DeserializationConfig cfg = _config.with(typer);
        JavaType type = _config.constructType(SimpleBean.class);
        TypeDeserializer td = cfg.findTypeDeserializer(type);
        Assert.assertNotNull(td);
    }
}
