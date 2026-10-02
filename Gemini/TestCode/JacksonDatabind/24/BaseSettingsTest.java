package com.fasterxml.jackson.databind.cfg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class BaseSettingsTest {

    private ClassIntrospector classIntrospector;
    private AnnotationIntrospector annotationIntrospector;
    private VisibilityChecker<?> visibilityChecker;
    private PropertyNamingStrategy propertyNamingStrategy;
    private TypeFactory typeFactory;
    private TypeResolverBuilder<?> typeResolverBuilder;
    private DateFormat dateFormat;
    private HandlerInstantiator handlerInstantiator;
    private Locale locale;
    private TimeZone timeZone;
    private Base64Variant defaultBase64;
    private BaseSettings baseSettings;

    @Before
    public void setUp() {
        classIntrospector = new BasicClassIntrospector();
        annotationIntrospector = new JacksonAnnotationIntrospector();
        visibilityChecker = VisibilityChecker.Std.defaultInstance();
        propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE;
        typeFactory = TypeFactory.defaultInstance();
        typeResolverBuilder = new StdTypeResolverBuilder();
        dateFormat = new StdDateFormat();
        handlerInstantiator = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) {
                return null;
            }

            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) {
                return null;
            }

            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                return null;
            }

            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) {
                return null;
            }

            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return null;
            }
        };
        locale = Locale.US;
        timeZone = TimeZone.getTimeZone("UTC");
        defaultBase64 = Base64Variants.MIME;

        baseSettings = new BaseSettings(
                classIntrospector,
                annotationIntrospector,
                visibilityChecker,
                propertyNamingStrategy,
                typeFactory,
                typeResolverBuilder,
                dateFormat,
                handlerInstantiator,
                locale,
                timeZone,
                defaultBase64
        );
    }

    @Test
    public void testGetters_normalInput_returnsConfiguredValues() {
        Assert.assertSame(classIntrospector, baseSettings.getClassIntrospector());
        Assert.assertSame(annotationIntrospector, baseSettings.getAnnotationIntrospector());
        Assert.assertSame(visibilityChecker, baseSettings.getVisibilityChecker());
        Assert.assertSame(propertyNamingStrategy, baseSettings.getPropertyNamingStrategy());
        Assert.assertSame(typeFactory, baseSettings.getTypeFactory());
        Assert.assertSame(typeResolverBuilder, baseSettings.getTypeResolverBuilder());
        Assert.assertSame(dateFormat, baseSettings.getDateFormat());
        Assert.assertSame(handlerInstantiator, baseSettings.getHandlerInstantiator());
        Assert.assertSame(locale, baseSettings.getLocale());
        Assert.assertSame(timeZone, baseSettings.getTimeZone());
        Assert.assertSame(defaultBase64, baseSettings.getBase64Variant());
    }

    @Test
    public void testWithClassIntrospector_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withClassIntrospector(classIntrospector);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithClassIntrospector_differentInstance_returnsNewInstance() {
        ClassIntrospector newCi = new BasicClassIntrospector();
        BaseSettings result = baseSettings.withClassIntrospector(newCi);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newCi, result.getClassIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospector_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withAnnotationIntrospector(annotationIntrospector);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithAnnotationIntrospector_differentInstance_returnsNewInstance() {
        AnnotationIntrospector newAi = AnnotationIntrospector.nopInstance();
        BaseSettings result = baseSettings.withAnnotationIntrospector(newAi);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newAi, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithInsertedAnnotationIntrospector_validInput_returnsPairedInstance() {
        AnnotationIntrospector insertedAi = AnnotationIntrospector.nopInstance();
        BaseSettings result = baseSettings.withInsertedAnnotationIntrospector(insertedAi);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertNotNull(result.getAnnotationIntrospector());
        Assert.assertNotSame(annotationIntrospector, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithAppendedAnnotationIntrospector_validInput_returnsPairedInstance() {
        AnnotationIntrospector appendedAi = AnnotationIntrospector.nopInstance();
        BaseSettings result = baseSettings.withAppendedAnnotationIntrospector(appendedAi);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertNotNull(result.getAnnotationIntrospector());
        Assert.assertNotSame(annotationIntrospector, result.getAnnotationIntrospector());
    }

    @Test
    public void testWithVisibilityChecker_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withVisibilityChecker(visibilityChecker);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithVisibilityChecker_differentInstance_returnsNewInstance() {
        VisibilityChecker<?> newVc = VisibilityChecker.Std.defaultInstance().withVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        BaseSettings result = baseSettings.withVisibilityChecker(newVc);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newVc, result.getVisibilityChecker());
    }

    @Test
    public void testWithVisibility_validInput_returnsUpdatedVisibilityChecker() {
        BaseSettings result = baseSettings.withVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertNotSame(visibilityChecker, result.getVisibilityChecker());
    }

    @Test
    public void testWithPropertyNamingStrategy_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withPropertyNamingStrategy(propertyNamingStrategy);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithPropertyNamingStrategy_differentInstance_returnsNewInstance() {
        PropertyNamingStrategy newPns = PropertyNamingStrategy.LOWER_CAMEL_CASE;
        BaseSettings result = baseSettings.withPropertyNamingStrategy(newPns);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newPns, result.getPropertyNamingStrategy());
    }

    @Test
    public void testWithTypeFactory_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withTypeFactory(typeFactory);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithTypeFactory_differentInstance_returnsNewInstance() {
        TypeFactory newTf = TypeFactory.defaultInstance().withModifier(null);
        BaseSettings result = baseSettings.withTypeFactory(newTf);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newTf, result.getTypeFactory());
    }

    @Test
    public void testWithTypeResolverBuilder_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withTypeResolverBuilder(typeResolverBuilder);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithTypeResolverBuilder_differentInstance_returnsNewInstance() {
        TypeResolverBuilder<?> newTyper = new StdTypeResolverBuilder();
        BaseSettings result = baseSettings.withTypeResolverBuilder(newTyper);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newTyper, result.getTypeResolverBuilder());
    }

    @Test
    public void testWithDateFormat_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withDateFormat(dateFormat);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithDateFormat_differentInstanceNonNull_updatesDateFormatAndTimeZone() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        TimeZone tz = TimeZone.getTimeZone("GMT+7");
        sdf.setTimeZone(tz);

        BaseSettings result = baseSettings.withDateFormat(sdf);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(sdf, result.getDateFormat());
        Assert.assertEquals(tz, result.getTimeZone());
    }

    @Test
    public void testWithDateFormat_null_retainsExistingTimeZone() {
        BaseSettings result = baseSettings.withDateFormat(null);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertNull(result.getDateFormat());
        Assert.assertSame(timeZone, result.getTimeZone());
    }

    @Test
    public void testWithHandlerInstantiator_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.withHandlerInstantiator(handlerInstantiator);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithHandlerInstantiator_differentInstance_returnsNewInstance() {
        HandlerInstantiator newHi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) {
                return null;
            }

            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) {
                return null;
            }

            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                return null;
            }

            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) {
                return null;
            }

            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return null;
            }
        };

        BaseSettings result = baseSettings.withHandlerInstantiator(newHi);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newHi, result.getHandlerInstantiator());
    }

    @Test
    public void testWithLocale_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.with(locale);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithLocale_differentInstance_returnsNewInstance() {
        Locale newLocale = Locale.GERMANY;
        BaseSettings result = baseSettings.with(newLocale);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newLocale, result.getLocale());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithTimeZone_null_throwsIllegalArgumentException() {
        baseSettings.with((TimeZone) null);
    }

    @Test
    public void testWithTimeZone_stdDateFormat_returnsUpdatedInstance() {
        TimeZone newTz = TimeZone.getTimeZone("PST");
        BaseSettings result = baseSettings.with(newTz);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newTz, result.getTimeZone());
        Assert.assertTrue(result.getDateFormat() instanceof StdDateFormat);
        Assert.assertEquals(newTz, result.getDateFormat().getTimeZone());
    }

    @Test
    public void testWithTimeZone_customDateFormat_clonesAndSetsTimeZone() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        BaseSettings customBase = baseSettings.withDateFormat(sdf);

        TimeZone newTz = TimeZone.getTimeZone("GMT+2");
        BaseSettings result = customBase.with(newTz);

        Assert.assertNotSame(customBase, result);
        Assert.assertSame(newTz, result.getTimeZone());
        Assert.assertNotSame(sdf, result.getDateFormat());
        Assert.assertEquals(newTz, result.getDateFormat().getTimeZone());
        Assert.assertEquals(TimeZone.getTimeZone("UTC"), sdf.getTimeZone());
    }

    @Test
    public void testWithBase64Variant_sameInstance_returnsSame() {
        BaseSettings result = baseSettings.with(defaultBase64);
        Assert.assertSame(baseSettings, result);
    }

    @Test
    public void testWithBase64Variant_differentInstance_returnsNewInstance() {
        Base64Variant newBase64 = Base64Variants.MODIFIED_FOR_URL;
        BaseSettings result = baseSettings.with(newBase64);
        Assert.assertNotSame(baseSettings, result);
        Assert.assertSame(newBase64, result.getBase64Variant());
    }
}
