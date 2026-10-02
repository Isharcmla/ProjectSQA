package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class POJOPropertyBuilderTest {

    private MapperConfig<?> config;
    private AnnotationIntrospector ai;
    private TypeResolutionContext typeResCtxt;

    static class BaseClass {
        public int value;
        public int getValue() { return value; }
        public void setValue(int v) { this.value = v; }
    }

    static class SubClass extends BaseClass {
        public int value;
        public SubClass() {}
        public SubClass(int v) { this.value = v; }
        public static SubClass create(int v) { return new SubClass(v); }

        @Override
        public int getValue() { return value; }
        public boolean isValue() { return value != 0; }
        public int value() { return value; }

        @Override
        public void setValue(int v) { this.value = v; }
        public void value(int v) { this.value = v; }

        public int getOther() { return 1; }
        public void setOther(int v) {}
    }

    static class ConflictClass {
        public int x;
        public int y;
        public int getA() { return x; }
        public int getB() { return y; }
        public void setA(int a) {}
        public void setB(int b) {}
    }

    @Before
    public void setUp() {
        ObjectMapper mapper = new ObjectMapper();
        this.config = mapper.getSerializationConfig();
        this.ai = new JacksonAnnotationIntrospector();
        this.typeResCtxt = new TypeResolutionContext.Basic(TypeFactory.defaultInstance(), TypeFactory.defaultInstance().constructType(SubClass.class));
    }

    private AnnotatedField createAnnotatedField(Class<?> cls, String fieldName) throws Exception {
        Field f = cls.getDeclaredField(fieldName);
        return new AnnotatedField(typeResCtxt, f, new AnnotationMap());
    }

    private AnnotatedMethod createAnnotatedMethod(Class<?> cls, String methodName, Class<?>... paramTypes) throws Exception {
        Method m = cls.getDeclaredMethod(methodName, paramTypes);
        int paramCount = paramTypes.length;
        AnnotationMap[] paramAnns = paramCount > 0 ? new AnnotationMap[paramCount] : null;
        if (paramAnns != null) {
            for (int i = 0; i < paramCount; i++) {
                paramAnns[i] = new AnnotationMap();
            }
        }
        return new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), paramAnns);
    }

    private AnnotatedParameter createAnnotatedParameterCtor(Class<?> cls, Class<?>... paramTypes) throws Exception {
        Constructor<?> ctor = cls.getDeclaredConstructor(paramTypes);
        AnnotatedConstructor aCtor = new AnnotatedConstructor(typeResCtxt, ctor, new AnnotationMap(), new AnnotationMap[paramTypes.length]);
        JavaType type = TypeFactory.defaultInstance().constructType(paramTypes[0]);
        return new AnnotatedParameter(aCtor, type, typeResCtxt, new AnnotationMap(), 0);
    }

    private AnnotatedParameter createAnnotatedParameterFactory(Class<?> cls, String methodName, Class<?>... paramTypes) throws Exception {
        Method m = cls.getDeclaredMethod(methodName, paramTypes);
        AnnotatedMethod aMethod = new AnnotatedMethod(typeResCtxt, m, new AnnotationMap(), new AnnotationMap[paramTypes.length]);
        JavaType type = TypeFactory.defaultInstance().constructType(paramTypes[0]);
        return new AnnotatedParameter(aMethod, type, typeResCtxt, new AnnotationMap(), 0);
    }

    @Test
    public void testConstructorAndNaming() {
        PropertyName pName = PropertyName.construct("prop");
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, pName);

        Assert.assertEquals("prop", builder.getName());
        Assert.assertEquals(pName, builder.getFullName());
        Assert.assertTrue(builder.hasName(pName));
        Assert.assertFalse(builder.hasName(PropertyName.construct("other")));
        Assert.assertEquals("prop", builder.getInternalName());

        POJOPropertyBuilder renamed = builder.withName(PropertyName.construct("newProp"));
        Assert.assertEquals("newProp", renamed.getName());

        POJOPropertyBuilder sameSimple = builder.withSimpleName("prop");
        Assert.assertSame(builder, sameSimple);

        POJOPropertyBuilder diffSimple = builder.withSimpleName("diffProp");
        Assert.assertEquals("diffProp", diffSimple.getName());

        POJOPropertyBuilder nullNameBuilder = new POJOPropertyBuilder(config, ai, true, PropertyName.NO_NAME, null);
        Assert.assertNull(nullNameBuilder.getName());
    }

    @Test
    public void testCompareTo() throws Exception {
        POJOPropertyBuilder p1 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("a"));
        POJOPropertyBuilder p2 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("b"));

        // neither has ctor param -> alphabetical
        Assert.assertTrue(p1.compareTo(p2) < 0);
        Assert.assertTrue(p2.compareTo(p1) > 0);
        Assert.assertEquals(0, p1.compareTo(p1));

        // p1 has ctor param -> comes first
        p1.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), PropertyName.construct("a"), true, true, false);
        Assert.assertTrue(p1.compareTo(p2) < 0);
        Assert.assertTrue(p2.compareTo(p1) > 0);

        // both have ctor param -> alphabetical
        p2.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), PropertyName.construct("b"), true, true, false);
        Assert.assertTrue(p1.compareTo(p2) < 0);
    }

    @Test
    public void testWrapperName() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, null, true, PropertyName.construct("p"));
        Assert.assertNull(builder.getWrapperName());

        AnnotationIntrospector mockAi = new NopAnnotationIntrospector() {
            @Override
            public PropertyName findWrapperName(Annotated ann) {
                return PropertyName.construct("wrapped_" + ann.getName());
            }
        };

        POJOPropertyBuilder builderWithAi = new POJOPropertyBuilder(config, mockAi, true, PropertyName.construct("p"));
        Assert.assertNull(builderWithAi.getWrapperName());

        builderWithAi.addField(createAnnotatedField(SubClass.class, "value"), PropertyName.construct("p"), true, true, false);
        PropertyName wrapper = builderWithAi.getWrapperName();
        Assert.assertNotNull(wrapper);
        Assert.assertEquals("wrapped_value", wrapper.getSimpleName());
    }

    @Test
    public void testIsExplicitlyIncludedAndNamed() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        Assert.assertFalse(builder.isExplicitlyIncluded());
        Assert.assertFalse(builder.isExplicitlyNamed());

        // Add explicit named field
        builder.addField(createAnnotatedField(SubClass.class, "value"), PropertyName.construct("prop"), true, true, false);
        Assert.assertTrue(builder.isExplicitlyIncluded());
        Assert.assertTrue(builder.isExplicitlyNamed());

        // Non explicit name
        POJOPropertyBuilder b2 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        b2.addField(createAnnotatedField(SubClass.class, "value"), PropertyName.construct("prop"), false, true, false);
        Assert.assertTrue(b2.isExplicitlyIncluded());
        Assert.assertFalse(b2.isExplicitlyNamed());

        // Creator explicit named
        POJOPropertyBuilder b3 = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        b3.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), PropertyName.construct("prop"), true, true, false);
        Assert.assertTrue(b3.isExplicitlyIncluded());
        Assert.assertTrue(b3.isExplicitlyNamed());

        // Creator implicit named
        POJOPropertyBuilder b4 = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        b4.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), PropertyName.construct("prop"), false, true, false);
        Assert.assertFalse(b4.isExplicitlyIncluded());
        Assert.assertFalse(b4.isExplicitlyNamed());

        // Getter explicit
        POJOPropertyBuilder b5 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        b5.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), PropertyName.construct("prop"), true, true, false);
        Assert.assertTrue(b5.isExplicitlyIncluded());
        Assert.assertTrue(b5.isExplicitlyNamed());

        // Setter explicit
        POJOPropertyBuilder b6 = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        b6.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), PropertyName.construct("prop"), true, true, false);
        Assert.assertTrue(b6.isExplicitlyIncluded());
        Assert.assertTrue(b6.isExplicitlyNamed());
    }

    @Test
    public void testPresenceAndCouldSerializeDeserialize() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));

        Assert.assertFalse(builder.hasGetter());
        Assert.assertFalse(builder.hasSetter());
        Assert.assertFalse(builder.hasField());
        Assert.assertFalse(builder.hasConstructorParameter());
        Assert.assertFalse(builder.couldSerialize());
        Assert.assertFalse(builder.couldDeserialize());

        builder.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        Assert.assertTrue(builder.hasField());
        Assert.assertTrue(builder.couldSerialize());
        Assert.assertTrue(builder.couldDeserialize());

        POJOPropertyBuilder bGetter = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        bGetter.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);
        Assert.assertTrue(bGetter.hasGetter());
        Assert.assertTrue(bGetter.couldSerialize());
        Assert.assertFalse(bGetter.couldDeserialize());

        POJOPropertyBuilder bSetter = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        bSetter.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, true, false);
        Assert.assertTrue(bSetter.hasSetter());
        Assert.assertFalse(bSetter.couldSerialize());
        Assert.assertTrue(bSetter.couldDeserialize());

        POJOPropertyBuilder bCtor = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        bCtor.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, false);
        Assert.assertTrue(bCtor.hasConstructorParameter());
        Assert.assertTrue(bCtor.couldDeserialize());
    }

    @Test
    public void testGetGetterPrioritiesAndConflicts() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        Assert.assertNull(builder.getGetter());

        AnnotatedMethod getM = createAnnotatedMethod(SubClass.class, "getValue");
        AnnotatedMethod isM = createAnnotatedMethod(SubClass.class, "isValue");
        AnnotatedMethod regularM = createAnnotatedMethod(SubClass.class, "value");

        // Priority 1 > 2 > 3
        builder.addGetter(regularM, null, false, true, false);
        builder.addGetter(isM, null, false, true, false);
        builder.addGetter(getM, null, false, true, false);

        AnnotatedMethod chosen = builder.getGetter();
        Assert.assertEquals("getValue", chosen.getName());

        // Masking: SubClass vs BaseClass
        POJOPropertyBuilder bInherit = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        AnnotatedMethod baseM = createAnnotatedMethod(BaseClass.class, "getValue");
        AnnotatedMethod subM = createAnnotatedMethod(SubClass.class, "getValue");
        bInherit.addGetter(baseM, null, false, true, false);
        bInherit.addGetter(subM, null, false, true, false);
        Assert.assertEquals(SubClass.class, bInherit.getGetter().getDeclaringClass());

        // Base after Sub in chain
        POJOPropertyBuilder bInherit2 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        bInherit2.addGetter(subM, null, false, true, false);
        bInherit2.addGetter(baseM, null, false, true, false);
        Assert.assertEquals(SubClass.class, bInherit2.getGetter().getDeclaringClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetGetterConflictThrows() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        AnnotatedMethod getA = createAnnotatedMethod(ConflictClass.class, "getA");
        AnnotatedMethod getB = createAnnotatedMethod(ConflictClass.class, "getB");
        builder.addGetter(getA, null, false, true, false);
        builder.addGetter(getB, null, false, true, false);
        builder.getGetter();
    }

    @Test
    public void testGetSetterPrioritiesAndConflicts() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        Assert.assertNull(builder.getSetter());

        AnnotatedMethod setM = createAnnotatedMethod(SubClass.class, "setValue", int.class);
        AnnotatedMethod regularM = createAnnotatedMethod(SubClass.class, "value", int.class);

        builder.addSetter(regularM, null, false, true, false);
        builder.addSetter(setM, null, false, true, false);

        AnnotatedMethod chosen = builder.getSetter();
        Assert.assertEquals("setValue", chosen.getName());

        // Inheritance resolution
        POJOPropertyBuilder bInherit = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        AnnotatedMethod baseM = createAnnotatedMethod(BaseClass.class, "setValue", int.class);
        AnnotatedMethod subM = createAnnotatedMethod(SubClass.class, "setValue", int.class);
        bInherit.addSetter(baseM, null, false, true, false);
        bInherit.addSetter(subM, null, false, true, false);
        Assert.assertEquals(SubClass.class, bInherit.getSetter().getDeclaringClass());

        // Introspector conflict resolution
        final AnnotatedMethod prefM = createAnnotatedMethod(ConflictClass.class, "setA", int.class);
        final AnnotatedMethod nonPrefM = createAnnotatedMethod(ConflictClass.class, "setB", int.class);
        AnnotationIntrospector resolverAi = new NopAnnotationIntrospector() {
            @Override
            public AnnotatedMethod resolveSetterConflict(MapperConfig<?> config, AnnotatedMethod setter1, AnnotatedMethod setter2) {
                if (setter1.getName().equals("setA") || setter2.getName().equals("setA")) {
                    return prefM;
                }
                return null;
            }
        };

        POJOPropertyBuilder bAiResolve1 = new POJOPropertyBuilder(config, resolverAi, false, PropertyName.construct("prop"));
        bAiResolve1.addSetter(prefM, null, false, true, false);
        bAiResolve1.addSetter(nonPrefM, null, false, true, false);
        Assert.assertEquals("setA", bAiResolve1.getSetter().getName());

        POJOPropertyBuilder bAiResolve2 = new POJOPropertyBuilder(config, resolverAi, false, PropertyName.construct("prop"));
        bAiResolve2.addSetter(nonPrefM, null, false, true, false);
        bAiResolve2.addSetter(prefM, null, false, true, false);
        Assert.assertEquals("setA", bAiResolve2.getSetter().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSetterConflictThrows() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        AnnotatedMethod setA = createAnnotatedMethod(ConflictClass.class, "setA", int.class);
        AnnotatedMethod setB = createAnnotatedMethod(ConflictClass.class, "setB", int.class);
        builder.addSetter(setA, null, false, true, false);
        builder.addSetter(setB, null, false, true, false);
        builder.getSetter();
    }

    @Test
    public void testGetFieldHierarchyAndConflict() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        Assert.assertNull(builder.getField());

        AnnotatedField baseField = createAnnotatedField(BaseClass.class, "value");
        AnnotatedField subField = createAnnotatedField(SubClass.class, "value");

        builder.addField(baseField, null, false, true, false);
        builder.addField(subField, null, false, true, false);
        Assert.assertEquals(SubClass.class, builder.getField().getDeclaringClass());

        POJOPropertyBuilder b2 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        b2.addField(subField, null, false, true, false);
        b2.addField(baseField, null, false, true, false);
        Assert.assertEquals(SubClass.class, b2.getField().getDeclaringClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldConflictThrows() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        AnnotatedField f1 = createAnnotatedField(ConflictClass.class, "x");
        AnnotatedField f2 = createAnnotatedField(ConflictClass.class, "y");
        builder.addField(f1, null, false, true, false);
        builder.addField(f2, null, false, true, false);
        builder.getField();
    }

    @Test
    public void testGetConstructorParameters() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        Assert.assertNull(builder.getConstructorParameter());

        Iterator<AnnotatedParameter> emptyIt = builder.getConstructorParameters();
        Assert.assertFalse(emptyIt.hasNext());

        AnnotatedParameter factoryParam = createAnnotatedParameterFactory(SubClass.class, "create", int.class);
        AnnotatedParameter ctorParam = createAnnotatedParameterCtor(SubClass.class, int.class);

        builder.addCtor(factoryParam, null, false, true, false);
        builder.addCtor(ctorParam, null, false, true, false);

        AnnotatedParameter found = builder.getConstructorParameter();
        Assert.assertTrue(found.getOwner() instanceof AnnotatedConstructor);

        Iterator<AnnotatedParameter> it = builder.getConstructorParameters();
        Assert.assertTrue(it.hasNext());
        Assert.assertNotNull(it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertNotNull(it.next());
        Assert.assertFalse(it.hasNext());

        try {
            it.next();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {}

        try {
            it.remove();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test
    public void testAccessorMutatorPrimaryMember() throws Exception {
        AnnotatedMethod getter = createAnnotatedMethod(SubClass.class, "getValue");
        AnnotatedMethod setter = createAnnotatedMethod(SubClass.class, "setValue", int.class);
        AnnotatedField field = createAnnotatedField(SubClass.class, "value");
        AnnotatedParameter ctorParam = createAnnotatedParameterCtor(SubClass.class, int.class);

        // Serialization primary member: getter -> field
        POJOPropertyBuilder serBuilder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        serBuilder.addField(field, null, false, true, false);
        Assert.assertEquals(field, serBuilder.getPrimaryMember());
        Assert.assertEquals(field, serBuilder.getAccessor());

        serBuilder.addGetter(getter, null, false, true, false);
        Assert.assertEquals(getter, serBuilder.getPrimaryMember());
        Assert.assertEquals(getter, serBuilder.getAccessor());

        // Deserialization primary member: ctorParam -> setter -> field
        POJOPropertyBuilder deserBuilder = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        deserBuilder.addField(field, null, false, true, false);
        Assert.assertEquals(field, deserBuilder.getPrimaryMember());
        Assert.assertEquals(field, deserBuilder.getMutator());
        Assert.assertEquals(field, deserBuilder.getNonConstructorMutator());

        deserBuilder.addSetter(setter, null, false, true, false);
        Assert.assertEquals(setter, deserBuilder.getPrimaryMember());
        Assert.assertEquals(setter, deserBuilder.getMutator());
        Assert.assertEquals(setter, deserBuilder.getNonConstructorMutator());

        deserBuilder.addCtor(ctorParam, null, false, true, false);
        Assert.assertEquals(ctorParam, deserBuilder.getPrimaryMember());
        Assert.assertEquals(ctorParam, deserBuilder.getMutator());
        Assert.assertEquals(setter, deserBuilder.getNonConstructorMutator());
    }

    @Test
    public void testRefinementsAndAnnotations() throws Exception {
        final ObjectIdInfo info = new ObjectIdInfo(PropertyName.construct("id"), Object.class, null, null);
        final JsonInclude.Value incl = JsonInclude.Value.empty().withValueInclusion(JsonInclude.Include.NON_NULL);

        AnnotationIntrospector testAi = new NopAnnotationIntrospector() {
            @Override
            public Class<?>[] findViews(Annotated a) {
                return new Class<?>[] { String.class };
            }

            @Override
            public ReferenceProperty findReferenceType(AnnotatedMember member) {
                return ReferenceProperty.back("backRef");
            }

            @Override
            public Boolean isTypeId(AnnotatedMember member) {
                return Boolean.TRUE;
            }

            @Override
            public Boolean hasRequiredMarker(AnnotatedMember m) {
                return Boolean.TRUE;
            }

            @Override
            public String findPropertyDescription(AnnotatedMember m) {
                return "desc";
            }

            @Override
            public Integer findPropertyIndex(AnnotatedMember m) {
                return 42;
            }

            @Override
            public String findPropertyDefaultValue(AnnotatedMember m) {
                return "def";
            }

            @Override
            public ObjectIdInfo findObjectIdInfo(Annotated ann) {
                return info;
            }

            @Override
            public ObjectIdInfo findObjectReferenceInfo(Annotated ann, ObjectIdInfo objectIdInfo) {
                return objectIdInfo;
            }

            @Override
            public JsonInclude.Value findPropertyInclusion(Annotated a) {
                return incl;
            }

            @Override
            public JsonProperty.Access findPropertyAccess(Annotated m) {
                return JsonProperty.Access.READ_ONLY;
            }
        };

        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, testAi, true, PropertyName.construct("prop"));
        builder.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);

        Assert.assertArrayEquals(new Class<?>[] { String.class }, builder.findViews());
        Assert.assertNotNull(builder.findReferenceType());
        Assert.assertTrue(builder.isTypeId());
        PropertyMetadata metadata = builder.getMetadata();
        Assert.assertTrue(metadata.isRequired());
        Assert.assertEquals("desc", metadata.getDescription());
        Assert.assertEquals(Integer.valueOf(42), metadata.getIndex());
        Assert.assertEquals("def", metadata.getDefaultValue());
        Assert.assertEquals(info, builder.findObjectIdInfo());
        Assert.assertEquals(incl, builder.findInclusion());
        Assert.assertEquals(JsonProperty.Access.READ_ONLY, builder.findAccess());

        // Default empty metadata when AI returns null
        POJOPropertyBuilder emptyBuilder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        PropertyMetadata stdMeta = emptyBuilder.getMetadata();
        Assert.assertNull(stdMeta.isRequired());
        Assert.assertEquals(JsonInclude.Value.empty(), emptyBuilder.findInclusion());
    }

    @Test
    public void testDataAggregationAndAddAll() throws Exception {
        POJOPropertyBuilder p1 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        POJOPropertyBuilder p2 = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));

        p1.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        p1.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);

        p2.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, true, false);
        p2.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, false);

        p1.addAll(p2);
        Assert.assertTrue(p1.hasField());
        Assert.assertTrue(p1.hasGetter());
        Assert.assertTrue(p1.hasSetter());
        Assert.assertTrue(p1.hasConstructorParameter());
    }

    @Test
    public void testRemoveIgnored() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        builder.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, true);
        builder.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, true);
        builder.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, true, true);
        builder.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, true);

        Assert.assertTrue(builder.anyIgnorals());
        builder.removeIgnored();
        Assert.assertFalse(builder.anyIgnorals());
        Assert.assertFalse(builder.hasField());
        Assert.assertFalse(builder.hasGetter());
        Assert.assertFalse(builder.hasSetter());
        Assert.assertFalse(builder.hasConstructorParameter());
    }

    @Test
    public void testRemoveNonVisibleAndRemoveConstructors() throws Exception {
        POJOPropertyBuilder bAuto = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        bAuto.addField(createAnnotatedField(SubClass.class, "value"), null, false, false, false);
        bAuto.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, false, false);
        bAuto.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, false, false);
        bAuto.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, false, false);

        Assert.assertFalse(bAuto.anyVisible());
        bAuto.removeNonVisible(false);
        Assert.assertFalse(bAuto.hasField());
        Assert.assertFalse(bAuto.hasGetter());
        Assert.assertFalse(bAuto.hasSetter());
        Assert.assertFalse(bAuto.hasConstructorParameter());

        // ReadOnly
        AnnotationIntrospector readOnlyAi = new NopAnnotationIntrospector() {
            @Override
            public JsonProperty.Access findPropertyAccess(Annotated m) {
                return JsonProperty.Access.READ_ONLY;
            }
        };
        POJOPropertyBuilder bReadOnlyDeser = new POJOPropertyBuilder(config, readOnlyAi, false, PropertyName.construct("prop"));
        bReadOnlyDeser.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        bReadOnlyDeser.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, true, false);
        bReadOnlyDeser.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, false);
        bReadOnlyDeser.removeNonVisible(true);
        Assert.assertFalse(bReadOnlyDeser.hasSetter());
        Assert.assertFalse(bReadOnlyDeser.hasConstructorParameter());
        Assert.assertFalse(bReadOnlyDeser.hasField());

        // WriteOnly
        AnnotationIntrospector writeOnlyAi = new NopAnnotationIntrospector() {
            @Override
            public JsonProperty.Access findPropertyAccess(Annotated m) {
                return JsonProperty.Access.WRITE_ONLY;
            }
        };
        POJOPropertyBuilder bWriteOnlySer = new POJOPropertyBuilder(config, writeOnlyAi, true, PropertyName.construct("prop"));
        bWriteOnlySer.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        bWriteOnlySer.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);
        bWriteOnlySer.removeNonVisible(true);
        Assert.assertFalse(bWriteOnlySer.hasGetter());
        Assert.assertFalse(bWriteOnlySer.hasField());

        // removeConstructors
        POJOPropertyBuilder bCtor = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        bCtor.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, false);
        Assert.assertTrue(bCtor.hasConstructorParameter());
        bCtor.removeConstructors();
        Assert.assertFalse(bCtor.hasConstructorParameter());
    }

    @Test
    public void testTrimByVisibility() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        AnnotatedField explicitF = createAnnotatedField(SubClass.class, "value");
        AnnotatedField implicitF = createAnnotatedField(BaseClass.class, "value");

        builder.addField(implicitF, null, false, true, false);
        builder.addField(explicitF, PropertyName.construct("prop"), true, true, false);

        builder.trimByVisibility();
        Assert.assertNotNull(builder.getField());
    }

    @Test
    public void testMergeAnnotations() throws Exception {
        POJOPropertyBuilder serBuilder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        serBuilder.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);
        serBuilder.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        serBuilder.mergeAnnotations(true);

        POJOPropertyBuilder deserBuilder = new POJOPropertyBuilder(config, ai, false, PropertyName.construct("prop"));
        deserBuilder.addCtor(createAnnotatedParameterCtor(SubClass.class, int.class), null, false, true, false);
        deserBuilder.addSetter(createAnnotatedMethod(SubClass.class, "setValue", int.class), null, false, true, false);
        deserBuilder.addField(createAnnotatedField(SubClass.class, "value"), null, false, true, false);
        deserBuilder.mergeAnnotations(false);
    }

    @Test
    public void testFindExplicitNamesAndExplode() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        Assert.assertTrue(builder.findExplicitNames().isEmpty());

        PropertyName name1 = PropertyName.construct("name1");
        PropertyName name2 = PropertyName.construct("name2");

        builder.addField(createAnnotatedField(SubClass.class, "value"), name1, true, true, false);
        builder.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), name2, true, true, false);

        Set<PropertyName> names = builder.findExplicitNames();
        Assert.assertEquals(2, names.size());
        Assert.assertTrue(names.contains(name1));
        Assert.assertTrue(names.contains(name2));

        Collection<POJOPropertyBuilder> exploded = builder.explode(names);
        Assert.assertEquals(2, exploded.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testExplodeConflictWithImplicitAccessor() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        builder.addField(createAnnotatedField(SubClass.class, "value"), PropertyName.construct("name1"), true, true, false);
        builder.addGetter(createAnnotatedMethod(SubClass.class, "getValue"), null, false, true, false);

        Set<PropertyName> names = new HashSet<PropertyName>(Arrays.asList(PropertyName.construct("name1"), PropertyName.construct("name2")));
        builder.explode(names);
    }

    @Test
    public void testLinkedNodeEdgeCases() throws Exception {
        AnnotatedField field = createAnnotatedField(SubClass.class, "value");
        PropertyName name = PropertyName.construct("test");

        POJOPropertyBuilder.Linked<AnnotatedField> node = new POJOPropertyBuilder.Linked<AnnotatedField>(
                field, null, name, true, true, false);

        Assert.assertEquals(field, node.value);
        Assert.assertNull(node.next);
        Assert.assertEquals(name, node.name);
        Assert.assertTrue(node.isNameExplicit);
        Assert.assertTrue(node.isVisible);
        Assert.assertFalse(node.isMarkedIgnored);

        POJOPropertyBuilder.Linked<AnnotatedField> nodeWithNext = node.withNext(node);
        Assert.assertNotNull(nodeWithNext.next);

        POJOPropertyBuilder.Linked<AnnotatedField> nodeWithoutNext = nodeWithNext.withoutNext();
        Assert.assertNull(nodeWithoutNext.next);

        POJOPropertyBuilder.Linked<AnnotatedField> sameValue = node.withValue(field);
        Assert.assertSame(node, sameValue);

        AnnotatedField field2 = createAnnotatedField(BaseClass.class, "value");
        POJOPropertyBuilder.Linked<AnnotatedField> diffValue = node.withValue(field2);
        Assert.assertEquals(field2, diffValue.value);

        Assert.assertNotNull(node.toString());

        try {
            new POJOPropertyBuilder.Linked<AnnotatedField>(field, null, null, true, true, false);
            Assert.fail("Expected IllegalArgumentException for explicitName with null PropertyName");
        } catch (IllegalArgumentException expected) {}
    }

    @Test
    public void testToString() throws Exception {
        POJOPropertyBuilder builder = new POJOPropertyBuilder(config, ai, true, PropertyName.construct("prop"));
        builder.addField(createAnnotatedField(SubClass.class, "value"), PropertyName.construct("prop"), true, true, false);
        String str = builder.toString();
        Assert.assertTrue(str.contains("Property 'prop'"));
        Assert.assertTrue(str.contains("field(s):"));
    }
}
