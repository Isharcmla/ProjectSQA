import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResolvedRecursiveTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType integerType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        integerType = typeFactory.constructType(Integer.class);
    }

    private ResolvedRecursiveType createType() {
        return new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
    }

    // --- Constructor test ---

    @Test
    public void testConstructor_normalInput_createsInstanceWithNullReference() {
        ResolvedRecursiveType type = createType();
        assertNotNull(type);
        assertNull(type.getSelfReferencedType());
    }

    // --- setReference / getSelfReferencedType ---

    @Test
    public void testSetReference_normalInput_setsReferenceCorrectly() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        assertEquals(stringType, type.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReference_calledTwice_throwsIllegalStateException() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        type.setReference(integerType);
    }

    @Test
    public void testGetSelfReferencedType_beforeSet_returnsNull() {
        ResolvedRecursiveType type = createType();
        assertNull(type.getSelfReferencedType());
    }

    // --- getGenericSignature ---

    @Test
    public void testGetGenericSignature_referenceSet_returnsDelegatedSignature() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericSignature_referenceNotSet_throwsNullPointerException() {
        ResolvedRecursiveType type = createType();
        StringBuilder sb = new StringBuilder();
        type.getGenericSignature(sb);
    }

    // --- getErasedSignature ---

    @Test
    public void testGetErasedSignature_referenceSet_returnsDelegatedSignature() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetErasedSignature_referenceNotSet_throwsNullPointerException() {
        ResolvedRecursiveType type = createType();
        StringBuilder sb = new StringBuilder();
        type.getErasedSignature(sb);
    }

    // --- withContentType ---

    @Test
    public void testWithContentType_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentType(stringType);
        assertSame(type, result);
    }

    @Test
    public void testWithContentType_nullInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentType(null);
        assertSame(type, result);
    }

    // --- withTypeHandler ---

    @Test
    public void testWithTypeHandler_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withTypeHandler(new Object());
        assertSame(type, result);
    }

    @Test
    public void testWithTypeHandler_nullInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withTypeHandler(null);
        assertSame(type, result);
    }

    // --- withContentTypeHandler ---

    @Test
    public void testWithContentTypeHandler_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentTypeHandler(new Object());
        assertSame(type, result);
    }

    @Test
    public void testWithContentTypeHandler_nullInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentTypeHandler(null);
        assertSame(type, result);
    }

    // --- withValueHandler ---

    @Test
    public void testWithValueHandler_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withValueHandler(new Object());
        assertSame(type, result);
    }

    @Test
    public void testWithValueHandler_nullInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withValueHandler(null);
        assertSame(type, result);
    }

    // --- withContentValueHandler ---

    @Test
    public void testWithContentValueHandler_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentValueHandler(new Object());
        assertSame(type, result);
    }

    @Test
    public void testWithContentValueHandler_nullInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withContentValueHandler(null);
        assertSame(type, result);
    }

    // --- withStaticTyping ---

    @Test
    public void testWithStaticTyping_normalInput_returnsSameInstance() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.withStaticTyping();
        assertSame(type, result);
    }

    // --- refine ---

    @Test
    public void testRefine_normalInput_returnsNull() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.refine(String.class, TypeBindings.emptyBindings(), stringType, new JavaType[0]);
        assertNull(result);
    }

    @Test
    public void testRefine_nullInputs_returnsNull() {
        ResolvedRecursiveType type = createType();
        JavaType result = type.refine(null, null, null, null);
        assertNull(result);
    }

    // --- isContainerType ---

    @Test
    public void testIsContainerType_normalCase_returnsFalse() {
        ResolvedRecursiveType type = createType();
        assertFalse(type.isContainerType());
    }

    // --- toString ---

    @Test
    public void testToString_unresolvedReference_returnsUnresolvedMessage() {
        ResolvedRecursiveType type = createType();
        String result = type.toString();
        assertTrue(result.contains("UNRESOLVED"));
        assertTrue(result.contains("[recursive type;"));
    }

    @Test
    public void testToString_resolvedReference_returnsClassName() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        String result = type.toString();
        assertTrue(result.contains(String.class.getName()));
    }

    // --- equals ---

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ResolvedRecursiveType type = createType();
        assertTrue(type.equals(type));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        ResolvedRecursiveType type = createType();
        assertFalse(type.equals(null));
    }

    @Test
    public void testEquals_unresolvedReference_returnsFalse() {
        ResolvedRecursiveType type1 = createType();
        ResolvedRecursiveType type2 = createType();
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEquals_differentClassObject_returnsFalse() {
        ResolvedRecursiveType type = createType();
        type.setReference(stringType);
        assertFalse(type.equals("some string"));
    }

    @Test
    public void testEquals_sameReferencedType_returnsTrue() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type1.setReference(stringType);
        type2.setReference(stringType);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEquals_differentReferencedType_returnsFalse() {
        ResolvedRecursiveType type1 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        ResolvedRecursiveType type2 = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        type1.setReference(stringType);
        type2.setReference(integerType);
        assertFalse(type1.equals(type2));
    }
}
