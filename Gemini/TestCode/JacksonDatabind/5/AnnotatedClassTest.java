package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.AnnotationIntrospector;

public class AnnotatedClassTest {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    public @interface MarkerA {
        String value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    public @interface MarkerB {
        String value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    @MarkerA("bundled")
    public @interface BundleAnn {
    }

    public static class SimpleMixInResolver implements ClassIntrospector.MixInResolver {
        private final Map<Class<?>, Class<?>> _mixins = new HashMap<Class<?>, Class<?>>();

        public SimpleMixInResolver add(Class<?> target, Class<?> mixin) {
            _mixins.put(target, mixin);
            return this;
        }

        @Override
        public Class<?> findMixInClassFor(Class<?> cls) {
            return _mixins.get(cls);
        }

        @Override
        public ClassIntrospector.MixInResolver copy() {
            SimpleMixInResolver copy = new SimpleMixInResolver();
            copy._mixins.putAll(_mixins);
            return copy;
        }
    }

    public static class CustomAnnotationIntrospector extends AnnotationIntrospector {
        private final Set<String> ignoredNames = new HashSet<String>();

        public void addIgnored(String name) {
            ignoredNames.add(name);
        }

        @Override
        public boolean isAnnotationBundle(Annotation ann) {
            return ann.annotationType() == BundleAnn.class;
        }

        @Override
        public boolean hasIgnoreMarker(AnnotatedMember m) {
            return ignoredNames.contains(m.getName());
        }

        @Override
        public com.fasterxml.jackson.core.Version version() {
            return com.fasterxml.jackson.core.Version.unknownVersion();
        }
    }

    @MarkerA("base")
    public static class BaseClass {
        @MarkerA("baseField")
        public int baseField;

        @MarkerA("baseMethod")
        public void baseMethod() {}

        public void sharedMethod() {}
    }

    @MarkerB("sub")
    @BundleAnn
    public static class SubClass extends BaseClass implements SampleInterface {
        @MarkerB("subField")
        public String subField;

        private transient int transientField;
        public static int staticField;

        public SubClass() {}

        public SubClass(@MarkerA("p1") String p1) {}

        public SubClass(int p1, int p2) {}

        @Override
        public void interfaceMethod() {}

        @MarkerB("subMethod")
        @Override
        public void sharedMethod() {}

        public static SubClass create(@MarkerA("f1") String param) {
            return new SubClass(param);
        }

        public static void nonFactory() {}

        public void threeArgMethod(int a, int b, int c) {}
    }

    public interface SampleInterface {
        @MarkerA("interface")
        void interfaceMethod();
    }

    public static class SubClassMixIn {
        @MarkerB("mixedField")
        public String subField;

        public SubClassMixIn() {}

        public SubClassMixIn(@MarkerB("mixedP1") String p1) {}

        @MarkerB("mixedFactory")
        public static SubClass create(@MarkerB("mixedF1") String param) {
            return null;
        }

        @MarkerB("mixedInterface")
        public void interfaceMethod() {}

        @MarkerA("objectHashCode")
        public int hashCode() { return 0; }
    }

    public static class ObjectMixIn {
        @MarkerB("objectToString")
        public String toString() { return ""; }
    }

    public enum SampleEnum {
        A("first"),
        B("second");

        private final String desc;

        SampleEnum(String desc) {
            this.desc = desc;
        }
    }

    public class NonStaticInner {
        public NonStaticInner(@MarkerA("inner") String val) {}
    }

    public interface InterfaceA {
        @MarkerA("A")
        void doSomething();
    }

    public static class ImplA implements InterfaceA {
        @Override
        public void doSomething() {}
    }

    @Test
    public void testConstructAndBasicGetters() {
        AnnotationIntrospector ai = new CustomAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, null);

        Assert.assertEquals(SubClass.class, ac.getAnnotated());
        Assert.assertEquals(SubClass.class, ac.getRawType());
        Assert.assertEquals(SubClass.class, ac.getGenericType());
        Assert.assertEquals(SubClass.class.getName(), ac.getName());
        Assert.assertEquals(SubClass.class.getModifiers(), ac.getModifiers());
        Assert.assertEquals("[AnnotedClass " + SubClass.class.getName() + "]", ac.toString());
    }

    @Test
    public void testConstructWithoutSuperTypes() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(SubClass.class, null, null);
        Assert.assertNotNull(ac);
        Assert.assertEquals(0, ac.getAnnotations().size());
        Assert.assertFalse(ac.hasAnnotations());
    }

    @Test
    public void testClassAnnotationsWithBundlesAndInheritance() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, null);

        Assert.assertTrue(ac.hasAnnotations());
        Assert.assertNotNull(ac.getAnnotation(MarkerB.class));
        Assert.assertEquals("sub", ac.getAnnotation(MarkerB.class).value());
        // MarkerA comes from BundleAnn or BaseClass
        Assert.assertNotNull(ac.getAnnotation(MarkerA.class));

        int count = 0;
        for (Annotation a : ac.annotations()) {
            count++;
        }
        Assert.assertTrue(count > 0);
        Assert.assertNotNull(ac.getAllAnnotations());
    }

    @Test
    public void testWithAnnotations() {
        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, null, null);
        AnnotationMap map = new AnnotationMap();
        AnnotatedClass modified = ac.withAnnotations(map);

        Assert.assertNotNull(modified);
        Assert.assertNotSame(ac, modified);
        Assert.assertEquals(0, modified.getAnnotations().size());
    }

    @Test
    public void testConstructorsAndMixins() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        SimpleMixInResolver mixins = new SimpleMixInResolver();
        mixins.add(SubClass.class, SubClassMixIn.class);

        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, mixins);

        AnnotatedConstructor defaultCtor = ac.getDefaultConstructor();
        Assert.assertNotNull(defaultCtor);
        Assert.assertEquals(0, defaultCtor.getParameterCount());

        List<AnnotatedConstructor> ctors = ac.getConstructors();
        Assert.assertNotNull(ctors);
        Assert.assertEquals(2, ctors.size());

        AnnotatedConstructor singleArgCtor = null;
        for (AnnotatedConstructor c : ctors) {
            if (c.getParameterCount() == 1) {
                singleArgCtor = c;
            }
        }
        Assert.assertNotNull(singleArgCtor);
        Assert.assertNotNull(singleArgCtor.getAnnotation(MarkerB.class));
        Assert.assertNotNull(singleArgCtor.getParamAnnotation(0, MarkerB.class));
    }

    @Test
    public void testStaticMethodsAndMixins() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        SimpleMixInResolver mixins = new SimpleMixInResolver();
        mixins.add(SubClass.class, SubClassMixIn.class);

        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, mixins);
        List<AnnotatedMethod> staticMethods = ac.getStaticMethods();

        Assert.assertNotNull(staticMethods);
        AnnotatedMethod factoryMethod = null;
        for (AnnotatedMethod m : staticMethods) {
            if (m.getName().equals("create")) {
                factoryMethod = m;
            }
        }
        Assert.assertNotNull(factoryMethod);
        Assert.assertNotNull(factoryMethod.getAnnotation(MarkerB.class));
        Assert.assertEquals("mixedFactory", factoryMethod.getAnnotation(MarkerB.class).value());
        Assert.assertNotNull(factoryMethod.getParamAnnotation(0, MarkerB.class));
    }

    @Test
    public void testIgnoredConstructorsAndStaticMethods() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        ai.addIgnored(""); // default constructor name / constructor marker
        ai.addIgnored("create");

        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, null);

        Assert.assertNull(ac.getDefaultConstructor());
        for (AnnotatedMethod m : ac.getStaticMethods()) {
            Assert.assertNotEquals("create", m.getName());
        }
    }

    @Test
    public void testMemberMethodsAndInterfaceOverrides() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, null);

        Assert.assertTrue(ac.getMemberMethodCount() > 0);
        AnnotatedMethod method = ac.findMethod("sharedMethod", new Class<?>[0]);
        Assert.assertNotNull(method);
        Assert.assertNotNull(method.getAnnotation(MarkerB.class));

        AnnotatedMethod ifaceMethod = ac.findMethod("interfaceMethod", new Class<?>[0]);
        Assert.assertNotNull(ifaceMethod);

        // 3-arg method should be filtered out
        Assert.assertNull(ac.findMethod("threeArgMethod", new Class<?>[]{int.class, int.class, int.class}));

        int count = 0;
        for (AnnotatedMethod m : ac.memberMethods()) {
            count++;
        }
        Assert.assertEquals(ac.getMemberMethodCount(), count);
    }

    @Test
    public void testInterfaceResolutionToImplementation() {
        AnnotatedClass ac = AnnotatedClass.construct(ImplA.class, new CustomAnnotationIntrospector(), null);
        AnnotatedMethod method = ac.findMethod("doSomething", new Class<?>[0]);
        Assert.assertNotNull(method);
        Assert.assertEquals(ImplA.class, method.getDeclaringClass());
        Assert.assertNotNull(method.getAnnotation(MarkerA.class));
    }

    @Test
    public void testFieldsAndFieldMixins() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        SimpleMixInResolver mixins = new SimpleMixInResolver();
        mixins.add(SubClass.class, SubClassMixIn.class);

        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, mixins);

        Assert.assertTrue(ac.getFieldCount() >= 2);
        boolean foundSubField = false;
        boolean foundBaseField = false;

        for (AnnotatedField f : ac.fields()) {
            if ("subField".equals(f.getName())) {
                foundSubField = true;
                Assert.assertNotNull(f.getAnnotation(MarkerB.class));
            } else if ("baseField".equals(f.getName())) {
                foundBaseField = true;
                Assert.assertNotNull(f.getAnnotation(MarkerA.class));
            } else if ("transientField".equals(f.getName()) || "staticField".equals(f.getName())) {
                Assert.fail("Transient and static fields should not be included");
            }
        }
        Assert.assertTrue(foundSubField);
        Assert.assertTrue(foundBaseField);
    }

    @Test
    public void testObjectMixins() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        SimpleMixInResolver mixins = new SimpleMixInResolver();
        mixins.add(Object.class, ObjectMixIn.class);
        mixins.add(SubClass.class, SubClassMixIn.class);

        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, ai, mixins);
        AnnotatedMethod toStringMethod = ac.findMethod("toString", new Class<?>[0]);
        Assert.assertNotNull(toStringMethod);
        Assert.assertNotNull(toStringMethod.getAnnotation(MarkerB.class));

        AnnotatedMethod hashMethod = ac.findMethod("hashCode", new Class<?>[0]);
        Assert.assertNotNull(hashMethod);
        Assert.assertNotNull(hashMethod.getAnnotation(MarkerA.class));
    }

    @Test
    public void testEnumConstructorResolution() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(SampleEnum.class, ai, null);

        List<AnnotatedConstructor> ctors = ac.getConstructors();
        Assert.assertNotNull(ctors);
        Assert.assertFalse(ctors.isEmpty());
        AnnotatedConstructor ctor = ctors.get(0);
        Assert.assertEquals(3, ctor.getParameterCount()); // hidden (name, ordinal) + desc
    }

    @Test
    public void testInnerClassConstructorResolution() {
        CustomAnnotationIntrospector ai = new CustomAnnotationIntrospector();
        AnnotatedClass ac = AnnotatedClass.construct(NonStaticInner.class, ai, null);

        List<AnnotatedConstructor> ctors = ac.getConstructors();
        Assert.assertNotNull(ctors);
        Assert.assertEquals(1, ctors.size());
        AnnotatedConstructor ctor = ctors.get(0);
        Assert.assertEquals(2, ctor.getParameterCount()); // implicit outer this + param
        Assert.assertNotNull(ctor.getParamAnnotation(1, MarkerA.class));
    }

    @Test
    public void testNoAnnotationIntrospector() {
        AnnotatedClass ac = AnnotatedClass.construct(SubClass.class, null, null);

        Assert.assertFalse(ac.hasAnnotations());
        Assert.assertNull(ac.getAnnotation(MarkerA.class));
        Assert.assertNotNull(ac.getDefaultConstructor());
        Assert.assertFalse(ac.getConstructors().isEmpty());
        Assert.assertFalse(ac.getStaticMethods().isEmpty());
        Assert.assertTrue(ac.getFieldCount() > 0);
        Assert.assertTrue(ac.getMemberMethodCount() > 0);
    }
}
