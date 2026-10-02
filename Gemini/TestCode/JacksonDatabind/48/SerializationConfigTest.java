package com.fasterxml.jackson.databind;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class SerializationConfigTest {

    private enum TestFormatFeature implements FormatFeature {
        TEST_FEATURE;

        @Override
        public boolean enabledByDefault() {
            return false;
        }

        @Override
        public int getMask() {
            return 1 << ordinal();
        }

        @Override
        public boolean enabledIn(int flags) {
            return (flags & getMask()) != 0;
        }
    }

    private static class NonInstantiatablePrettyPrinter implements PrettyPrinter, Serializable {
        private static final long serialVersionUID = 1L;

        @Override
        public void writeRootValueSeparator(JsonGenerator gen) throws IOException {}
        @Override
        public void writeStartObject(JsonGenerator gen) throws IOException {}
        @Override
        public void writeEndObject(JsonGenerator gen, int nrOfEntries) throws IOException {}
        @Override
        public void writeObjectEntrySeparator(JsonGenerator gen) throws IOException {}
        @Override
        public void writeObjectFieldValueSeparator(JsonGenerator gen) throws IOException {}
        @Override
        public void writeStartArray(JsonGenerator gen) throws IOException {}
        @Override
        public void writeEndArray(JsonGenerator gen, int nrOfValues) throws IOException {}
        @Override
        public void writeArrayValueSeparator(JsonGenerator gen) throws IOException {}
        @Override
        public void beforeArrayValues(JsonGenerator gen) throws IOException {}
        @Override
        public void beforeObjectEntries(JsonGenerator gen) throws IOException {}
    }

    private static class DummyBean {
        public String id;
        public String getName() { return id; }
        public boolean isValid() { return true; }
    }

    private ObjectMapper mapper;
    private SerializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    @Test
    public void testDirectConstructor_defaultState_success() {
        BaseSettings base = mapper.getDeserializationConfig().getBaseSettings();
        SubtypeResolver str = new StdSubtypeResolver();
        SimpleMixInResolver mixins = new SimpleMixInResolver(null);
        RootNameLookup rootNames = new RootNameLookup();

        SerializationConfig cfg = new SerializationConfig(base, str, mixins, rootNames);
        Assert.assertNotNull(cfg);
        Assert.assertNull(cfg.getFilterProvider());
        Assert.assertNotNull(cfg.getDefaultPrettyPrinter());
        Assert.assertEquals(JsonInclude.Value.empty(), cfg.getDefaultPropertyInclusion());
        Assert.assertEquals(0, cfg._generatorFeatures);
        Assert.assertEquals(0, cfg._generatorFeaturesToChange);
        Assert.assertEquals(0, cfg._formatWriteFeatures);
        Assert.assertEquals(0, cfg._formatWriteFeaturesToChange);
    }

    @Test
    public void testWithMapperFeatures_varargs_modifiesAndReturnsSameWhenUnchanged() {
        SerializationConfig modified = config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        Assert.assertTrue(modified.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        Assert.assertTrue(modified.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));

        SerializationConfig same = modified.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
        Assert.assertSame(modified, same);
    }

    @Test
    public void testWithoutMapperFeatures_varargs_modifiesAndReturnsSameWhenUnchanged() {
        SerializationConfig modified = config.without(MapperFeature.AUTO_DETECT_FIELDS, MapperFeature.AUTO_DETECT_GETTERS);
        Assert.assertFalse(modified.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        Assert.assertFalse(modified.isEnabled(MapperFeature.AUTO_DETECT_GETTERS));

        SerializationConfig same = modified.without(MapperFeature.AUTO_DETECT_FIELDS);
        Assert.assertSame(modified, same);
    }

    @Test
    public void testWithMapperFeature_booleanState_modifiesCorrectly() {
        SerializationConfig modified = config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        Assert.assertTrue(modified.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));

        SerializationConfig sameTrue = modified.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        Assert.assertSame(modified, sameTrue);

        SerializationConfig modifiedFalse = modified.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        Assert.assertFalse(modifiedFalse.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));

        SerializationConfig sameFalse = modifiedFalse.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        Assert.assertSame(modifiedFalse, sameFalse);
    }

    @Test
    public void testWithAnnotationIntrospectors_appendedAndInserted_modifies() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        SerializationConfig cfg1 = config.with(ai);
        Assert.assertNotNull(cfg1.getAnnotationIntrospector());

        SerializationConfig cfg2 = config.withAppendedAnnotationIntrospector(ai);
        Assert.assertNotSame(config, cfg2);

        SerializationConfig cfg3 = config.withInsertedAnnotationIntrospector(ai);
        Assert.assertNotSame(config, cfg3);
    }

    @Test
    public void testWithClassIntrospector_modifies() {
        ClassIntrospector ci = config.getClassIntrospector();
        SerializationConfig cfg = config.with(ci);
        Assert.assertSame(config, cfg);
    }

    @Test
    public void testWithDateFormat_notNullAndNull_togglesTimestampFeature() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        SerializationConfig cfg1 = config.with(df);
        Assert.assertEquals(df, cfg1.getDateFormat());
        Assert.assertFalse(cfg1.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        SerializationConfig cfg2 = cfg1.with((DateFormat) null);
        Assert.assertTrue(cfg2.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testWithHandlerInstantiator_modifies() {
        HandlerInstantiator hi = null;
        SerializationConfig cfg = config.with(hi);
        Assert.assertSame(config, cfg);
    }

    @Test
    public void testWithPropertyNamingStrategy_modifies() {
        PropertyNamingStrategy pns = PropertyNamingStrategy.SNAKE_CASE;
        SerializationConfig cfg = config.with(pns);
        Assert.assertEquals(pns, cfg.getPropertyNamingStrategy());

        SerializationConfig same = cfg.with(pns);
        Assert.assertSame(cfg, same);
    }

    @Test
    public void testWithRootName_nullAndNonNull_returnsExpected() {
        SerializationConfig same = config.withRootName((PropertyName) null);
        Assert.assertSame(config, same);

        PropertyName pn = new PropertyName("root");
        SerializationConfig cfg1 = config.withRootName(pn);
        Assert.assertEquals(pn, cfg1.getFullRootName());

        SerializationConfig samePn = cfg1.withRootName(new PropertyName("root"));
        Assert.assertSame(cfg1, samePn);

        SerializationConfig cleared = cfg1.withRootName((PropertyName) null);
        Assert.assertNull(cleared.getFullRootName());
    }

    @Test
    public void testWithSubtypeResolver_modifiesAndReturnsSame() {
        SubtypeResolver str = new StdSubtypeResolver();
        SerializationConfig cfg = config.with(str);
        Assert.assertSame(str, cfg.getSubtypeResolver());

        SerializationConfig same = cfg.with(str);
        Assert.assertSame(cfg, same);
    }

    @Test
    public void testWithTypeFactory_modifiesAndReturnsSame() {
        TypeFactory tf = TypeFactory.defaultInstance();
        SerializationConfig cfg = config.with(tf);
        Assert.assertSame(config, cfg);

        TypeFactory customTf = TypeFactory.defaultInstance().withModifier(null);
        SerializationConfig cfg2 = config.with(customTf);
        Assert.assertNotNull(cfg2);
    }

    @Test
    public void testWithTypeResolverBuilder_modifies() {
        TypeResolverBuilder<?> trb = new StdTypeResolverBuilder();
        SerializationConfig cfg = config.with(trb);
        Assert.assertNotSame(config, cfg);
    }

    @Test
    public void testWithView_modifiesAndReturnsSame() {
        SerializationConfig cfg = config.withView(String.class);
        Assert.assertEquals(String.class, cfg.getActiveView());

        SerializationConfig same = cfg.withView(String.class);
        Assert.assertSame(cfg, same);
    }

    @Test
    public void testWithVisibilityChecker_modifies() {
        VisibilityChecker<?> vc = config.getDefaultVisibilityChecker();
        SerializationConfig cfg = config.with(vc);
        Assert.assertSame(config, cfg);
    }

    @Test
    public void testWithVisibility_accessorAndVisibility_modifies() {
        SerializationConfig cfg = config.withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Assert.assertNotSame(config, cfg);
    }

    @Test
    public void testWithLocaleAndTimeZoneAndBase64_modifies() {
        SerializationConfig cfg1 = config.with(Locale.GERMANY);
        Assert.assertEquals(Locale.GERMANY, cfg1.getLocale());
        Assert.assertSame(cfg1, cfg1.with(Locale.GERMANY));

        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        SerializationConfig cfg2 = config.with(tz);
        Assert.assertEquals(tz, cfg2.getTimeZone());
        Assert.assertSame(cfg2, cfg2.with(tz));

        SerializationConfig cfg3 = config.with(Base64Variants.MIME);
        Assert.assertEquals(Base64Variants.MIME, cfg3.getBase64Variant());
        Assert.assertSame(cfg3, cfg3.with(Base64Variants.MIME));
    }

    @Test
    public void testWithContextAttributes_modifiesAndReturnsSame() {
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("key", "val");
        SerializationConfig cfg = config.with(attrs);
        Assert.assertEquals("val", cfg.getAttributes().getAttribute("key"));

        SerializationConfig same = cfg.with(attrs);
        Assert.assertSame(cfg, same);
    }

    @Test
    public void testSerializationFeatureOperations_allVariants() {
        SerializationConfig cfg1 = config.with(SerializationFeature.INDENT_OUTPUT);
        Assert.assertTrue(cfg1.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertSame(cfg1, cfg1.with(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig cfg2 = config.with(SerializationFeature.INDENT_OUTPUT, SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        Assert.assertTrue(cfg2.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertTrue(cfg2.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS));

        SerializationConfig cfg3 = config.withFeatures(SerializationFeature.INDENT_OUTPUT, SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        Assert.assertTrue(cfg3.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertTrue(cfg3.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS));
        Assert.assertSame(cfg3, cfg3.withFeatures(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig cfg4 = cfg3.without(SerializationFeature.INDENT_OUTPUT);
        Assert.assertFalse(cfg4.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertSame(cfg4, cfg4.without(SerializationFeature.INDENT_OUTPUT));

        SerializationConfig cfg5 = cfg3.without(SerializationFeature.INDENT_OUTPUT, SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        Assert.assertFalse(cfg5.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertFalse(cfg5.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS));

        SerializationConfig cfg6 = cfg3.withoutFeatures(SerializationFeature.INDENT_OUTPUT, SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
        Assert.assertFalse(cfg6.isEnabled(SerializationFeature.INDENT_OUTPUT));
        Assert.assertFalse(cfg6.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS));
        Assert.assertSame(cfg6, cfg6.withoutFeatures(SerializationFeature.INDENT_OUTPUT));

        int mask = SerializationFeature.INDENT_OUTPUT.getMask();
        Assert.assertTrue(cfg3.hasSerializationFeatures(mask));
        Assert.assertEquals(cfg3.getSerializationFeatures(), cfg3._serFeatures);
    }

    @Test
    public void testJsonGeneratorFeatureOperations_allVariants() {
        SerializationConfig cfg1 = config.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertTrue(cfg1.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, new JsonFactory()));
        Assert.assertSame(cfg1, cfg1.with(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        SerializationConfig cfg2 = config.withFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES, JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        Assert.assertSame(cfg2, cfg2.withFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        SerializationConfig cfg3 = cfg2.without(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertFalse(cfg3.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES, new JsonFactory()));
        Assert.assertSame(cfg3, cfg3.without(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        SerializationConfig cfg4 = cfg2.withoutFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES, JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        Assert.assertSame(cfg4, cfg4.withoutFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES));

        JsonFactory jf = new JsonFactory();
        Assert.assertEquals(jf.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION),
                config.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION, jf));
    }

    @Test
    public void testFormatFeatureOperations_allVariants() {
        SerializationConfig cfg1 = config.with(TestFormatFeature.TEST_FEATURE);
        Assert.assertSame(cfg1, cfg1.with(TestFormatFeature.TEST_FEATURE));

        SerializationConfig cfg2 = config.withFeatures(TestFormatFeature.TEST_FEATURE);
        Assert.assertSame(cfg2, cfg2.withFeatures(TestFormatFeature.TEST_FEATURE));

        SerializationConfig cfg3 = cfg1.without(TestFormatFeature.TEST_FEATURE);
        Assert.assertSame(cfg3, cfg3.without(TestFormatFeature.TEST_FEATURE));

        SerializationConfig cfg4 = cfg1.withoutFeatures(TestFormatFeature.TEST_FEATURE);
        Assert.assertSame(cfg4, cfg4.withoutFeatures(TestFormatFeature.TEST_FEATURE));
    }

    @Test
    public void testWithFilters_modifiesAndReturnsSame() {
        FilterProvider fp = new SimpleFilterProvider();
        SerializationConfig cfg = config.withFilters(fp);
        Assert.assertSame(fp, cfg.getFilterProvider());

        SerializationConfig same = cfg.withFilters(fp);
        Assert.assertSame(cfg, same);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testWithPropertyInclusion_andDeprecatedMethods() {
        SerializationConfig cfg1 = config.withSerializationInclusion(JsonInclude.Include.NON_NULL);
        Assert.assertEquals(JsonInclude.Include.NON_NULL, cfg1.getSerializationInclusion());

        JsonInclude.Value inclVal = JsonInclude.Value.construct(JsonInclude.Include.NON_DEFAULT, JsonInclude.Include.NON_EMPTY);
        SerializationConfig cfg2 = config.withPropertyInclusion(inclVal);
        Assert.assertEquals(inclVal, cfg2.getDefaultPropertyInclusion());
        Assert.assertEquals(inclVal, cfg2.getDefaultPropertyInclusion(String.class));
        Assert.assertSame(cfg2, cfg2.withPropertyInclusion(inclVal));

        SerializationConfig cfgDefaults = config.withPropertyInclusion(JsonInclude.Value.empty());
        Assert.assertEquals(JsonInclude.Include.ALWAYS, cfgDefaults.getSerializationInclusion());
    }

    @Test
    public void testWithDefaultPrettyPrinter_andConstructDefaultPrettyPrinter() {
        PrettyPrinter pp = new MinimalPrettyPrinter();
        SerializationConfig cfg = config.withDefaultPrettyPrinter(pp);
        Assert.assertSame(pp, cfg.getDefaultPrettyPrinter());
        Assert.assertSame(cfg, cfg.withDefaultPrettyPrinter(pp));

        PrettyPrinter constructed = cfg.constructDefaultPrettyPrinter();
        Assert.assertNotNull(constructed);

        SerializationConfig cfgNonInstantiatable = config.withDefaultPrettyPrinter(new NonInstantiatablePrettyPrinter());
        PrettyPrinter constructed2 = cfgNonInstantiatable.constructDefaultPrettyPrinter();
        Assert.assertTrue(constructed2 instanceof NonInstantiatablePrettyPrinter);
    }

    @Test
    public void testInitializeJsonGenerator_allBranches() throws IOException {
        JsonFactory jf = new JsonFactory();

        SerializationConfig cfgIndent = config.with(SerializationFeature.INDENT_OUTPUT)
                .with(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN)
                .with(JsonGenerator.Feature.QUOTE_FIELD_NAMES)
                .with(TestFormatFeature.TEST_FEATURE);

        JsonGenerator gen1 = jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8);
        cfgIndent.initialize(gen1);
        Assert.assertNotNull(gen1.getPrettyPrinter());

        JsonGenerator gen2 = jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8);
        MinimalPrettyPrinter existingPp = new MinimalPrettyPrinter();
        gen2.setPrettyPrinter(existingPp);
        cfgIndent.initialize(gen2);
        Assert.assertSame(existingPp, gen2.getPrettyPrinter());

        SerializationConfig cfgNullPp = config.with(SerializationFeature.INDENT_OUTPUT)
                .withDefaultPrettyPrinter(null)
                .without(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);
        JsonGenerator gen3 = jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8);
        cfgNullPp.initialize(gen3);
        Assert.assertNull(gen3.getPrettyPrinter());
    }

    @Test
    public void testGetAnnotationIntrospector_enabledAndDisabled() {
        SerializationConfig enabled = config.with(MapperFeature.USE_ANNOTATIONS);
        Assert.assertNotNull(enabled.getAnnotationIntrospector());
        Assert.assertNotEquals(AnnotationIntrospector.nopInstance(), enabled.getAnnotationIntrospector());

        SerializationConfig disabled = config.without(MapperFeature.USE_ANNOTATIONS);
        Assert.assertEquals(AnnotationIntrospector.nopInstance(), disabled.getAnnotationIntrospector());
    }

    @Test
    public void testIntrospectMethods_success() {
        JavaType type = mapper.constructType(DummyBean.class);

        BeanDescription desc = config.introspect(type);
        Assert.assertNotNull(desc);

        BeanDescription classDesc = config.introspectClassAnnotations(type);
        Assert.assertNotNull(classDesc);

        BeanDescription directDesc = config.introspectDirectClassAnnotations(type);
        Assert.assertNotNull(directDesc);
    }

    @Test
    public void testGetDefaultVisibilityChecker_withDifferentMapperFeatures() {
        SerializationConfig custom = config.without(MapperFeature.AUTO_DETECT_GETTERS)
                .without(MapperFeature.AUTO_DETECT_IS_GETTERS)
                .without(MapperFeature.AUTO_DETECT_FIELDS);

        VisibilityChecker<?> vc = custom.getDefaultVisibilityChecker();
        Assert.assertNotNull(vc);
    }

    @Test
    public void testGetDefaultPropertyFormat_returnsEmptyFormat() {
        JsonFormat.Value format = config.getDefaultPropertyFormat(DummyBean.class);
        Assert.assertNotNull(format);
        Assert.assertEquals(JsonFormat.Value.empty(), format);
    }

    @Test
    public void testUseRootWrapping_conditions() {
        SerializationConfig cfgWithoutRootName = config.without(SerializationFeature.WRAP_ROOT_VALUE);
        Assert.assertFalse(cfgWithoutRootName.useRootWrapping());

        SerializationConfig cfgWithWrapRoot = config.with(SerializationFeature.WRAP_ROOT_VALUE);
        Assert.assertTrue(cfgWithWrapRoot.useRootWrapping());

        SerializationConfig cfgEmptyRootName = config.withRootName(new PropertyName(""));
        Assert.assertFalse(cfgEmptyRootName.useRootWrapping());

        SerializationConfig cfgNonEmptyRootName = config.withRootName(new PropertyName("MyRoot"));
        Assert.assertTrue(cfgNonEmptyRootName.useRootWrapping());
    }

    @Test
    public void testToString_notNull() {
        String str = config.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.startsWith("[SerializationConfig: flags=0x"));
    }
}
