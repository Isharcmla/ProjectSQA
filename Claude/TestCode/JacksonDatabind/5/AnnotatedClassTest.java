package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Modifier;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.util.Annotations;

public class AnnotatedClassTest
{
    /* ------------------------------------------------------------
     * Helper: minimal AnnotationIntrospector implementation
     * ------------------------------------------------------------
     */
    static class SimpleIntrospector extends AnnotationIntrospector
    {
        private static final long serialVersionUID = 1L;

        @Override
        public Version version() {
            return Version.unknownVersion();
        }
    }

    /* ------------------------------------------------------------
     * Helper annotations
     * ------------------------------------------------------------
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    static @interface AnnoA { String value(); }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    static @interface AnnoB { String value(); }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    static @interface AnnoNotUsed { String value(); }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    static @interface MixInAnnotation { String value(); }

    /* ------------------------------------------------------------
     * Sample classes for testing
     * ------------------------------------------------------------
     */
    @AnnoB("base-b")
    static class Base {
        public int baseField = 1;
        private String basePrivate = "p";
        static int baseStatic = 5;
        transient int baseTransient = 2;

        public Base() {}

        public void baseMethod() {}

        public String getBasePrivate() { return basePrivate; }
    }

    @AnnoA("derived-a")
    static class Derived extends Base {
        public String derivedField = "d";
        protected int protectedField = 2;

        public Derived() {}
        public Derived(String s) {}

        public static Derived createInstance() { return new Derived(); }
        public static Derived createInstance(String s) { return new Derived(s); }

        public void derivedMethod(String s) {}
        public void overloaded() {}
        public void overloaded(String s) {}
        private void privateMethod() {}
    }

    static class PlainClass {
        // implicit default constructor, no fields, no methods
    }

    static class NoDefaultCtor {
        public NoDefaultCtor(String s) {}
    }

    @MixInAnnotation("mixin-value")
    static class MixInTarget {}

    /* ------------------------------------------------------------
     * Simple MixInResolver implementation
     * ------------------------------------------------------------
     */
    static class SimpleMixInResolver implements MixInResolver
    {
        private final Class<?> _target;
        private final Class<?> _mixin;

        SimpleMixInResolver(Class<?> target, Class<?> mixin) {
            _target = target;
            _mixin = mixin;
        }

        @Override
        public Class<?> findMixInClassFor(Class<?> cls) {
            if (_target != null && _target.equals(cls)) {
                return _mixin;
            }
            return null;
        }
    }

    private final AnnotationIntrospector introspector = new SimpleIntrospector();

    /* ------------------------------------------------------------
     * Tests: construct / constructWithoutSuperTypes
     * ------------------------------------------------------------
     */

    @Test
    public void testConstruct_withValidClass_returnsAnnotatedClass()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertNotNull(ac);
        assertEquals(Derived.class, ac.getAnnotated());
    }

    @Test(expected = NullPointerException.class)
    public void testConstruct_withNullClass_throwsException()
    {
        AnnotatedClass.construct(null, introspector, null);
    }

    @Test
    public void testConstructWithoutSuperTypes_excludesSuperTypeAnnotations()
    {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Derived.class, introspector, null);
        // Own class annotation should be present
        assertNotNull(ac.getAnnotation(AnnoA.class));
        // Super type annotation should NOT be present since super types excluded
        assertNull(ac.getAnnotation(AnnoB.class));
        assertTrue(ac.hasAnnotations());
    }

    /* ------------------------------------------------------------
     * Tests: basic Annotated impl accessors
     * ------------------------------------------------------------
     */

    @Test
    public void testGetAnnotated_returnsCorrectClass()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertSame(Derived.class, ac.getAnnotated());
    }

    @Test
    public void testGetModifiers_returnsClassModifiers()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertEquals(Derived.class.getModifiers(), ac.getModifiers());
    }

    @Test
    public void testGetName_returnsClassName()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertEquals(Derived.class.getName(), ac.getName());
    }

    @Test
    public void testGetGenericType_returnsClass()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertEquals(Derived.class, ac.getGenericType());
    }

    @Test
    public void testGetRawType_returnsClass()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertEquals(Derived.class, ac.getRawType());
    }

    @Test
    public void testToString_returnsFormattedString()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertEquals("[AnnotedClass " + Derived.class.getName() + "]", ac.toString());
    }

    /* ------------------------------------------------------------
     * Tests: class annotation resolution
     * ------------------------------------------------------------
     */

    @Test
    public void testGetAnnotation_withOwnAnnotation_returnsAnnotation()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnoA anno = ac.getAnnotation(AnnoA.class);
        assertNotNull(anno);
        assertEquals("derived-a", anno.value());
    }

    @Test
    public void testGetAnnotation_withInheritedAnnotation_returnsAnnotation()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnoB anno = ac.getAnnotation(AnnoB.class);
        assertNotNull(anno);
        assertEquals("base-b", anno.value());
    }

    @Test
    public void testGetAnnotation_withAbsentAnnotation_returnsNull()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertNull(ac.getAnnotation(AnnoNotUsed.class));
    }

    @Test
    public void testGetAnnotation_withNullIntrospector_returnsNull()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, null, null);
        // annotation processing disabled entirely
        assertNull(ac.getAnnotation(AnnoA.class));
        assertFalse(ac.hasAnnotations());
    }

    @Test
    public void testAnnotations_returnsIterableContainingClassAnnotations()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        boolean foundA = false;
        boolean foundB = false;
        for (Annotation a : ac.annotations()) {
            if (a instanceof AnnoA) foundA = true;
            if (a instanceof AnnoB) foundB = true;
        }
        assertTrue(foundA);
        assertTrue(foundB);
    }

    @Test
    public void testGetAnnotations_returnsNonNullAnnotations()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        Annotations annos = ac.getAnnotations();
        assertNotNull(annos);
        assertTrue(annos.size() > 0);
    }

    @Test
    public void testHasAnnotations_withAnnotatedClass_returnsTrue()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        assertTrue(ac.hasAnnotations());
    }

    @Test
    public void testHasAnnotations_withPlainClassNoAnnotations_returnsFalse()
    {
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, null);
        assertFalse(ac.hasAnnotations());
    }

    /* ------------------------------------------------------------
     * Tests: mix-in resolution
     * ------------------------------------------------------------
     */

    @Test
    public void testGetAnnotation_withMixIn_returnsMixInAnnotation()
    {
        SimpleMixInResolver resolver = new SimpleMixInResolver(PlainClass.class, MixInTarget.class);
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, resolver);
        MixInAnnotation anno = ac.getAnnotation(MixInAnnotation.class);
        assertNotNull(anno);
        assertEquals("mixin-value", anno.value());
    }

    @Test
    public void testGetAnnotation_withNoMixInMatch_returnsNull()
    {
        SimpleMixInResolver resolver = new SimpleMixInResolver(Derived.class, MixInTarget.class);
        // resolver only maps Derived.class, not PlainClass.class
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, resolver);
        assertNull(ac.getAnnotation(MixInAnnotation.class));
    }

    /* ------------------------------------------------------------
     * Tests: withAnnotations
     * ------------------------------------------------------------
     */

    @Test
    public void testWithAnnotations_returnsNewInstanceWithGivenAnnotations()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnotationMap newMap = new AnnotationMap();
        AnnotatedClass ac2 = ac.withAnnotations(newMap);
        assertNotNull(ac2);
        assertNotSame(ac, ac2);
        assertEquals(Derived.class, ac2.getAnnotated());
        // the new map is empty, so no annotations should resolve, and resolveClassAnnotations should NOT be triggered
        assertFalse(ac2.hasAnnotations());
        assertNull(ac2.getAnnotation(AnnoA.class));
    }

    /* ------------------------------------------------------------
     * Tests: constructors
     * ------------------------------------------------------------
     */

    @Test
    public void testGetDefaultConstructor_withDefaultCtor_returnsConstructor()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnotatedConstructor ctor = ac.getDefaultConstructor();
        assertNotNull(ctor);
    }

    @Test
    public void testGetDefaultConstructor_withoutDefaultCtor_returnsNull()
    {
        AnnotatedClass ac = AnnotatedClass.construct(NoDefaultCtor.class, introspector, null);
        assertNull(ac.getDefaultConstructor());
    }

    @Test
    public void testGetConstructors_returnsNonDefaultConstructors()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        List<AnnotatedConstructor> ctors = ac.getConstructors();
        assertNotNull(ctors);
        assertEquals(1, ctors.size());
    }

    @Test
    public void testGetConstructors_withPlainClass_returnsEmptyList()
    {
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, null);
        List<AnnotatedConstructor> ctors = ac.getConstructors();
        assertNotNull(ctors);
        assertTrue(ctors.isEmpty());
    }

    @Test
    public void testGetConstructors_withNullIntrospector_stillResolves()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, null, null);
        assertNotNull(ac.getDefaultConstructor());
        assertEquals(1, ac.getConstructors().size());
    }

    /* ------------------------------------------------------------
     * Tests: static factory methods
     * ------------------------------------------------------------
     */

    @Test
    public void testGetStaticMethods_withFactoryMethods_returnsMethods()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        List<AnnotatedMethod> methods = ac.getStaticMethods();
        assertNotNull(methods);
        assertEquals(2, methods.size());
    }

    @Test
    public void testGetStaticMethods_withNoStaticMethods_returnsEmptyList()
    {
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, null);
        List<AnnotatedMethod> methods = ac.getStaticMethods();
        assertNotNull(methods);
        assertTrue(methods.isEmpty());
    }

    /* ------------------------------------------------------------
     * Tests: member methods
     * ------------------------------------------------------------
     */

    @Test
    public void testMemberMethods_returnsIterableOfMethods()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        int count = 0;
        for (AnnotatedMethod m : ac.memberMethods()) {
            assertNotNull(m);
            count++;
        }
        assertTrue(count > 0);
    }

    @Test
    public void testGetMemberMethodCount_returnsExpectedCount()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        // baseMethod, getBasePrivate (from Base) + derivedMethod, overloaded(), overloaded(String), privateMethod (from Derived)
        assertEquals(6, ac.getMemberMethodCount());
    }

    @Test
    public void testGetMemberMethodCount_withPlainClass_returnsZero()
    {
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, null);
        assertEquals(0, ac.getMemberMethodCount());
    }

    @Test
    public void testFindMethod_withExistingMethod_returnsMethod()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnotatedMethod m = ac.findMethod("derivedMethod", new Class<?>[]{ String.class });
        assertNotNull(m);
    }

    @Test
    public void testFindMethod_withNonExistingMethod_returnsNull()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnotatedMethod m = ac.findMethod("noSuchMethod", new Class<?>[]{});
        assertNull(m);
    }

    @Test
    public void testFindMethod_withOverloadedMethods_returnsCorrectOverload()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        AnnotatedMethod noArg = ac.findMethod("overloaded", new Class<?>[]{});
        AnnotatedMethod oneArg = ac.findMethod("overloaded", new Class<?>[]{ String.class });
        assertNotNull(noArg);
        assertNotNull(oneArg);
    }

    /* ------------------------------------------------------------
     * Tests: fields
     * ------------------------------------------------------------
     */

    @Test
    public void testGetFieldCount_returnsExpectedCount()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        // baseField, basePrivate, derivedField, protectedField (static and transient excluded)
        assertEquals(4, ac.getFieldCount());
    }

    @Test
    public void testGetFieldCount_withPlainClass_returnsZero()
    {
        AnnotatedClass ac = AnnotatedClass.construct(PlainClass.class, introspector, null);
        assertEquals(0, ac.getFieldCount());
    }

    @Test
    public void testFields_returnsIterableOfFields()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        int count = 0;
        for (AnnotatedField f : ac.fields()) {
            assertNotNull(f);
            count++;
        }
        assertEquals(4, count);
    }

    @Test
    public void testFields_withNullIntrospector_stillResolvesFields()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, null, null);
        assertEquals(4, ac.getFieldCount());
    }

    /* ------------------------------------------------------------
     * Extra edge-case: modifiers on a class using Modifier constants
     * ------------------------------------------------------------
     */

    @Test
    public void testGetModifiers_isStaticAndPublic()
    {
        AnnotatedClass ac = AnnotatedClass.construct(Derived.class, introspector, null);
        int mods = ac.getModifiers();
        assertTrue(Modifier.isStatic(mods));
        assertTrue(Modifier.isPublic(mods));
    }
}
