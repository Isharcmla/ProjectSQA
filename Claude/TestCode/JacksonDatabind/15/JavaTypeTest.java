import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JavaTypeTest {

    // ---------------------------------------------------------------
    // Minimal concrete implementation used to exercise JavaType's
    // abstract & template methods through its public API.
    // ---------------------------------------------------------------
    static class TestJavaType extends JavaType {

        protected TestJavaType(Class<?> raw) {
            this(raw, null, null, false);
        }

        protected TestJavaType(Class<?> raw, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, 0, valueHandler, typeHandler, asStatic);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new TestJavaType(_class, _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new TestJavaType(_class, h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new TestJavaType(_class, _valueHandler, _typeHandler, true);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, _valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public JavaType widenContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public boolean isContainerType() {
            return false;
        }

        @Override
        public Class<?> getParameterSource() {
            return _class;
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            return sb.append("Generic:").append(_class.getName());
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            return sb.append("Erased:").append(_class.getName());
        }

        @Override
        public String toString() {
            return "[TestJavaType, class " + _class.getName() + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestJavaType)) {
                return false;
            }
            TestJavaType other = (TestJavaType) o;
            return other._class == _class;
        }
    }

    /**
     * Subclass whose {@code _narrow} intentionally drops handlers, forcing
     * {@link JavaType#narrowBy} / {@link JavaType#forcedNarrowBy} to exercise
     * the branch that re-applies value/type handlers.
     */
    static class HandlerDroppingJavaType extends TestJavaType {
        HandlerDroppingJavaType(Class<?> raw, Object vh, Object th) {
            super(raw, vh, th, false);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new HandlerDroppingJavaType(subclass, null, null);
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new HandlerDroppingJavaType(_class, h, _typeHandler);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new HandlerDroppingJavaType(_class, _valueHandler, h);
        }
    }

    /**
     * Subclass used to exercise "container type" related overrides
     * (hasGenericTypes / containedType / isContainerType / etc).
     */
    static class ContainerJavaType extends TestJavaType {
        private final JavaType _content;

        ContainerJavaType(Class<?> raw, JavaType content) {
            super(raw);
            _content = content;
        }

        @Override
        public boolean isContainerType() {
            return true;
        }

        @Override
        public boolean isCollectionLikeType() {
            return true;
        }

        @Override
        public boolean isMapLikeType() {
            return true;
        }

        @Override
        public int containedTypeCount() {
            return 1;
        }

        @Override
        public JavaType containedType(int index) {
            if (index == 0) {
                return _content;
            }
            return null;
        }

        @Override
        public String containedTypeName(int index) {
            if (index == 0 && _content != null) {
                return _content.getRawClass().getName();
            }
            return null;
        }

        @Override
        public JavaType getContentType() {
            return _content;
        }

        @Override
        public JavaType getKeyType() {
            return _content;
        }
    }

    enum DummyEnum { A, B }

    private TestJavaType numberType;

    @Before
    public void setUp() {
        numberType = new TestJavaType(Number.class);
    }

    // ---------------------------------------------------------------
    // getRawClass / hasRawClass
    // ---------------------------------------------------------------

    @Test
    public void testGetRawClass_typical_returnsCorrectClass() {
        assertEquals(Number.class, numberType.getRawClass());
    }

    @Test
    public void testHasRawClass_sameClass_returnsTrue() {
        assertTrue(numberType.hasRawClass(Number.class));
    }

    @Test
    public void testHasRawClass_differentClass_returnsFalse() {
        assertFalse(numberType.hasRawClass(String.class));
    }

    @Test
    public void testHasRawClass_null_returnsFalse() {
        assertFalse(numberType.hasRawClass(null));
    }

    // ---------------------------------------------------------------
    // isAbstract
    // ---------------------------------------------------------------

    @Test
    public void testIsAbstract_abstractClass_returnsTrue() {
        assertTrue(numberType.isAbstract());
    }

    @Test
    public void testIsAbstract_concreteClass_returnsFalse() {
        TestJavaType t = new TestJavaType(String.class);
        assertFalse(t.isAbstract());
    }

    // ---------------------------------------------------------------
    // isConcrete
    // ---------------------------------------------------------------

    @Test
    public void testIsConcrete_concreteClass_returnsTrue() {
        TestJavaType t = new TestJavaType(String.class);
        assertTrue(t.isConcrete());
    }

    @Test
    public void testIsConcrete_interface_returnsFalse() {
        TestJavaType t = new TestJavaType(Runnable.class);
        assertFalse(t.isConcrete());
    }

    @Test
    public void testIsConcrete_primitive_returnsTrue() {
        TestJavaType t = new TestJavaType(int.class);
        assertTrue(t.isConcrete());
    }

    @Test
    public void testIsConcrete_abstractClass_returnsFalse() {
        assertFalse(numberType.isConcrete());
    }

    // ---------------------------------------------------------------
    // isThrowable
    // ---------------------------------------------------------------

    @Test
    public void testIsThrowable_throwableSubclass_returnsTrue() {
        TestJavaType t = new TestJavaType(IllegalArgumentException.class);
        assertTrue(t.isThrowable());
    }

    @Test
    public void testIsThrowable_nonThrowable_returnsFalse() {
        TestJavaType t = new TestJavaType(String.class);
        assertFalse(t.isThrowable());
    }

    // ---------------------------------------------------------------
    // isArrayType
    // ---------------------------------------------------------------

    @Test
    public void testIsArrayType_always_returnsFalse() {
        assertFalse(numberType.isArrayType());
        TestJavaType arrType = new TestJavaType(int[].class);
        assertFalse(arrType.isArrayType());
    }

    // ---------------------------------------------------------------
    // isEnumType
    // ---------------------------------------------------------------

    @Test
    public void testIsEnumType_enumClass_returnsTrue() {
        TestJavaType t = new TestJavaType(DummyEnum.class);
        assertTrue(t.isEnumType());
    }

    @Test
    public void testIsEnumType_nonEnumClass_returnsFalse() {
        TestJavaType t = new TestJavaType(String.class);
        assertFalse(t.isEnumType());
    }

    // ---------------------------------------------------------------
    // isInterface
    // ---------------------------------------------------------------

    @Test
    public void testIsInterface_interface_returnsTrue() {
        TestJavaType t = new TestJavaType(Runnable.class);
        assertTrue(t.isInterface());
    }

    @Test
    public void testIsInterface_class_returnsFalse() {
        TestJavaType t = new TestJavaType(String.class);
        assertFalse(t.isInterface());
    }

    // ---------------------------------------------------------------
    // isPrimitive
    // ---------------------------------------------------------------

    @Test
    public void testIsPrimitive_primitiveType_returnsTrue() {
        TestJavaType t = new TestJavaType(int.class);
        assertTrue(t.isPrimitive());
    }

    @Test
    public void testIsPrimitive_nonPrimitiveType_returnsFalse() {
        TestJavaType t = new TestJavaType(String.class);
        assertFalse(t.isPrimitive());
    }

    // ---------------------------------------------------------------
    // isFinal
    // ---------------------------------------------------------------

    @Test
    public void testIsFinal_finalClass_returnsTrue() {
        TestJavaType t = new TestJavaType(String.class);
        assertTrue(t.isFinal());
    }

    @Test
    public void testIsFinal_nonFinalClass_returnsFalse() {
        assertFalse(numberType.isFinal());
    }

    // ---------------------------------------------------------------
    // isContainerType / isCollectionLikeType / isMapLikeType
    // ---------------------------------------------------------------

    @Test
    public void testIsContainerType_default_returnsFalse() {
        assertFalse(numberType.isContainerType());
    }

    @Test
    public void testIsContainerType_overridden_returnsTrue() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertTrue(c.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType_default_returnsFalse() {
        assertFalse(numberType.isCollectionLikeType());
    }

    @Test
    public void testIsCollectionLikeType_overridden_returnsTrue() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertTrue(c.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_default_returnsFalse() {
        assertFalse(numberType.isMapLikeType());
    }

    @Test
    public void testIsMapLikeType_overridden_returnsTrue() {
        ContainerJavaType c = new ContainerJavaType(java.util.Map.class, numberType);
        assertTrue(c.isMapLikeType());
    }

    // ---------------------------------------------------------------
    // useStaticType
    // ---------------------------------------------------------------

    @Test
    public void testUseStaticType_falseByDefault_returnsFalse() {
        assertFalse(numberType.useStaticType());
    }

    @Test
    public void testUseStaticType_afterWithStaticTyping_returnsTrue() {
        JavaType t = numberType.withStaticTyping();
        assertTrue(t.useStaticType());
    }

    // ---------------------------------------------------------------
    // hasGenericTypes / containedTypeCount / containedType / containedTypeName
    // ---------------------------------------------------------------

    @Test
    public void testHasGenericTypes_default_returnsFalse() {
        assertFalse(numberType.hasGenericTypes());
    }

    @Test
    public void testHasGenericTypes_withContainedTypes_returnsTrue() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertTrue(c.hasGenericTypes());
    }

    @Test
    public void testContainedTypeCount_default_returnsZero() {
        assertEquals(0, numberType.containedTypeCount());
    }

    @Test
    public void testContainedType_default_returnsNull() {
        assertNull(numberType.containedType(0));
    }

    @Test
    public void testContainedTypeName_default_returnsNull() {
        assertNull(numberType.containedTypeName(0));
    }

    @Test
    public void testContainedType_overridden_returnsExpectedType() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertSame(numberType, c.containedType(0));
        assertNull(c.containedType(1));
    }

    @Test
    public void testContainedTypeName_overridden_returnsExpectedName() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertEquals(Number.class.getName(), c.containedTypeName(0));
    }

    // ---------------------------------------------------------------
    // getKeyType / getContentType
    // ---------------------------------------------------------------

    @Test
    public void testGetKeyType_default_returnsNull() {
        assertNull(numberType.getKeyType());
    }

    @Test
    public void testGetContentType_default_returnsNull() {
        assertNull(numberType.getContentType());
    }

    @Test
    public void testGetContentType_overridden_returnsExpected() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        assertSame(numberType, c.getContentType());
    }

    // ---------------------------------------------------------------
    // getParameterSource
    // ---------------------------------------------------------------

    @Test
    public void testGetParameterSource_typical_returnsRawClass() {
        assertEquals(Number.class, numberType.getParameterSource());
    }

    // ---------------------------------------------------------------
    // containedTypeOrUnknown
    // ---------------------------------------------------------------

    @Test
    public void testContainedTypeOrUnknown_noContained_returnsUnknownType() {
        JavaType unknown = numberType.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testContainedTypeOrUnknown_withContained_returnsContained() {
        ContainerJavaType c = new ContainerJavaType(java.util.List.class, numberType);
        JavaType result = c.containedTypeOrUnknown(0);
        assertSame(numberType, result);
    }

    // ---------------------------------------------------------------
    // getValueHandler / getTypeHandler
    // ---------------------------------------------------------------

    @Test
    public void testGetValueHandler_default_returnsNull() {
        assertNull(numberType.<Object>getValueHandler());
    }

    @Test
    public void testGetTypeHandler_default_returnsNull() {
        assertNull(numberType.<Object>getTypeHandler());
    }

    @Test
    public void testGetValueHandler_afterWith_returnsSetValue() {
        Object handler = "value-handler";
        JavaType t = numberType.withValueHandler(handler);
        assertEquals(handler, t.<Object>getValueHandler());
    }

    @Test
    public void testGetTypeHandler_afterWith_returnsSetValue() {
        Object handler = "type-handler";
        JavaType t = numberType.withTypeHandler(handler);
        assertEquals(handler, t.<Object>getTypeHandler());
    }

    @Test
    public void testWithValueHandler_null_returnsNullHandler() {
        JavaType t = numberType.withValueHandler(null);
        assertNull(t.<Object>getValueHandler());
    }

    @Test
    public void testWithTypeHandler_null_returnsNullHandler() {
        JavaType t = numberType.withTypeHandler(null);
        assertNull(t.<Object>getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_typical_returnsInstance() {
        JavaType t = numberType.withContentTypeHandler("content-type-handler");
        assertNotNull(t);
    }

    @Test
    public void testWithContentValueHandler_typical_returnsInstance() {
        JavaType t = numberType.withContentValueHandler("content-value-handler");
        assertNotNull(t);
    }

    // ---------------------------------------------------------------
    // getGenericSignature / getErasedSignature
    // ---------------------------------------------------------------

    @Test
    public void testGetGenericSignature_noArg_returnsExpectedString() {
        String sig = numberType.getGenericSignature();
        assertTrue(sig.contains("Number"));
    }

    @Test
    public void testGetGenericSignature_withStringBuilder_appendsSignature() {
        StringBuilder sb = new StringBuilder("PREFIX:");
        StringBuilder result = numberType.getGenericSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().startsWith("PREFIX:"));
    }

    @Test
    public void testGetErasedSignature_noArg_returnsExpectedString() {
        String sig = numberType.getErasedSignature();
        assertTrue(sig.contains("Number"));
    }

    @Test
    public void testGetErasedSignature_withStringBuilder_appendsSignature() {
        StringBuilder sb = new StringBuilder("PREFIX:");
        StringBuilder result = numberType.getErasedSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().startsWith("PREFIX:"));
    }

    // ---------------------------------------------------------------
    // narrowBy
    // ---------------------------------------------------------------

    @Test
    public void testNarrowBy_sameClass_returnsSameInstance() {
        JavaType result = numberType.narrowBy(Number.class);
        assertSame(numberType, result);
    }

    @Test
    public void testNarrowBy_compatibleSubclass_returnsNarrowedType() {
        JavaType result = numberType.narrowBy(Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowBy_incompatibleClass_throwsException() {
        numberType.narrowBy(String.class);
    }

    @Test
    public void testNarrowBy_handlerPreserved_whenNarrowKeepsHandlers() {
        TestJavaType t = new TestJavaType(Number.class, "VH", "TH", false);
        JavaType result = t.narrowBy(Integer.class);
        assertEquals("VH", result.<Object>getValueHandler());
        assertEquals("TH", result.<Object>getTypeHandler());
    }

    @Test
    public void testNarrowBy_handlerReapplied_whenNarrowDropsHandlers() {
        HandlerDroppingJavaType t = new HandlerDroppingJavaType(Number.class, "VH", "TH");
        JavaType result = t.narrowBy(Integer.class);
        assertEquals("VH", result.<Object>getValueHandler());
        assertEquals("TH", result.<Object>getTypeHandler());
        assertEquals(Integer.class, result.getRawClass());
    }

    // ---------------------------------------------------------------
    // forcedNarrowBy
    // ---------------------------------------------------------------

    @Test
    public void testForcedNarrowBy_sameClass_returnsSameInstance() {
        JavaType result = numberType.forcedNarrowBy(Number.class);
        assertSame(numberType, result);
    }

    @Test
    public void testForcedNarrowBy_differentClass_returnsNarrowedType_noAssertCheck() {
        // forcedNarrowBy skips the compatibility check, even unrelated types are allowed
        JavaType result = numberType.forcedNarrowBy(String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testForcedNarrowBy_handlerReapplied_whenNarrowDropsHandlers() {
        HandlerDroppingJavaType t = new HandlerDroppingJavaType(Number.class, "VH", "TH");
        JavaType result = t.forcedNarrowBy(Integer.class);
        assertEquals("VH", result.<Object>getValueHandler());
        assertEquals("TH", result.<Object>getTypeHandler());
    }

    @Test
    public void testForcedNarrowBy_handlerPreserved_whenNarrowKeepsHandlers() {
        TestJavaType t = new TestJavaType(Number.class, "VH", "TH", false);
        JavaType result = t.forcedNarrowBy(Integer.class);
        assertEquals("VH", result.<Object>getValueHandler());
        assertEquals("TH", result.<Object>getTypeHandler());
    }

    // ---------------------------------------------------------------
    // widenBy
    // ---------------------------------------------------------------

    @Test
    public void testWidenBy_sameClass_returnsSameInstance() {
        JavaType result = numberType.widenBy(Number.class);
        assertSame(numberType, result);
    }

    @Test
    public void testWidenBy_differentClass_returnsWidenedType() {
        TestJavaType intType = new TestJavaType(Integer.class);
        JavaType result = intType.widenBy(Number.class);
        assertEquals(Number.class, result.getRawClass());
    }

    // ---------------------------------------------------------------
    // narrowContentsBy / widenContentsBy
    // ---------------------------------------------------------------

    @Test
    public void testNarrowContentsBy_typical_returnsInstance() {
        JavaType result = numberType.narrowContentsBy(Integer.class);
        assertNotNull(result);
    }

    @Test
    public void testWidenContentsBy_typical_returnsInstance() {
        JavaType result = numberType.widenContentsBy(Object.class);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // equals / hashCode / toString
    // ---------------------------------------------------------------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(numberType.equals(numberType));
    }

    @Test
    public void testEquals_equivalentInstance_returnsTrue() {
        TestJavaType other = new TestJavaType(Number.class);
        assertTrue(numberType.equals(other));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        TestJavaType other = new TestJavaType(String.class);
        assertFalse(numberType.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(numberType.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(numberType.equals("not-a-java-type"));
    }

    @Test
    public void testHashCode_consistentWithClassName_returnsExpectedValue() {
        int expected = Number.class.getName().hashCode();
        assertEquals(expected, numberType.hashCode());
    }

    @Test
    public void testHashCode_sameForEquivalentInstances_returnsTrue() {
        TestJavaType other = new TestJavaType(Number.class);
        assertEquals(numberType.hashCode(), other.hashCode());
    }

    @Test
    public void testToString_typical_containsClassName() {
        String s = numberType.toString();
        assertTrue(s.contains("Number"));
    }
}
