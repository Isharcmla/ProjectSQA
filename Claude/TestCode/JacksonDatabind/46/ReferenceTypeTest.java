import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class ReferenceTypeTest {

    private TypeFactory typeFactory;
    private JavaType stringType;
    private JavaType integerType;
    private ReferenceType refTypeInstance;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        integerType = typeFactory.constructType(Integer.class);
        refTypeInstance = ReferenceType.construct(AtomicReference.class, stringType, null, null);
    }

    // ---------- construct ----------

    @Test
    public void testConstruct_normalInput_createsReferenceType() {
        ReferenceType rt = ReferenceType.construct(AtomicReference.class, stringType, null, null);
        assertNotNull(rt);
        assertEquals(stringType, rt.getReferencedType());
        assertTrue(rt.isReferenceType());
    }

    // ---------- getReferencedType ----------

    @Test
    public void testGetReferencedType_returnsCorrectType() {
        assertEquals(stringType, refTypeInstance.getReferencedType());
    }

    // ---------- isReferenceType ----------

    @Test
    public void testIsReferenceType_returnsTrue() {
        assertTrue(refTypeInstance.isReferenceType());
    }

    // ---------- containedTypeCount ----------

    @Test
    public void testContainedTypeCount_returnsOne() {
        assertEquals(1, refTypeInstance.containedTypeCount());
    }

    // ---------- containedType ----------

    @Test
    public void testContainedType_indexZero_returnsReferencedType() {
        assertEquals(stringType, refTypeInstance.containedType(0));
    }

    @Test
    public void testContainedType_indexNonZero_returnsNull() {
        assertNull(refTypeInstance.containedType(1));
        assertNull(refTypeInstance.containedType(-1));
    }

    // ---------- containedTypeName ----------

    @Test
    public void testContainedTypeName_indexZero_returnsT() {
        assertEquals("T", refTypeInstance.containedTypeName(0));
    }

    @Test
    public void testContainedTypeName_indexNonZero_returnsNull() {
        assertNull(refTypeInstance.containedTypeName(1));
        assertNull(refTypeInstance.containedTypeName(-1));
    }

    // ---------- getParameterSource ----------

    @Test
    public void testGetParameterSource_returnsClass() {
        assertEquals(AtomicReference.class, refTypeInstance.getParameterSource());
    }

    // ---------- getErasedSignature ----------

    @Test
    public void testGetErasedSignature_returnsNonNullSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = refTypeInstance.getErasedSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.toString().contains("AtomicReference"));
    }

    // ---------- getGenericSignature ----------

    @Test
    public void testGetGenericSignature_returnsNonNullSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = refTypeInstance.getGenericSignature(sb);
        assertNotNull(result);
        assertTrue(result.length() > 0);
        assertTrue(result.toString().contains("AtomicReference"));
        assertTrue(result.toString().contains("<"));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsExpectedFormat() {
        String str = refTypeInstance.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("[reference type, class "));
        assertTrue(str.contains("AtomicReference"));
        assertTrue(str.endsWith("]"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(refTypeInstance.equals(refTypeInstance));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(refTypeInstance.equals(null));
    }

    @Test
    public void testEquals_differentClassType_returnsFalse() {
        assertFalse(refTypeInstance.equals("not a reference type"));
    }

    @Test
    public void testEquals_differentRawClass_returnsFalse() {
        ReferenceType other = ReferenceType.construct(Optional.class, stringType, null, null);
        assertFalse(refTypeInstance.equals(other));
    }

    @Test
    public void testEquals_differentReferencedType_returnsFalse() {
        ReferenceType other = ReferenceType.construct(AtomicReference.class, integerType, null, null);
        assertFalse(refTypeInstance.equals(other));
    }

    @Test
    public void testEquals_sameValues_returnsTrue() {
        ReferenceType other = ReferenceType.construct(AtomicReference.class, stringType, null, null);
        assertTrue(refTypeInstance.equals(other));
    }

    // ---------- withTypeHandler ----------

    @Test
    public void testWithTypeHandler_sameHandler_returnsThis() {
        ReferenceType result = refTypeInstance.withTypeHandler(null);
        assertSame(refTypeInstance, result);
    }

    @Test
    public void testWithTypeHandler_differentHandler_returnsNewInstance() {
        Object handler = new Object();
        ReferenceType result = refTypeInstance.withTypeHandler(handler);
        assertNotSame(refTypeInstance, result);
        assertEquals(handler, result.getTypeHandler());
    }

    // ---------- withContentTypeHandler ----------

    @Test
    public void testWithContentTypeHandler_sameHandler_returnsThis() {
        // referenced type's type handler is null by default
        ReferenceType result = refTypeInstance.withContentTypeHandler(null);
        assertSame(refTypeInstance, result);
    }

    @Test
    public void testWithContentTypeHandler_differentHandler_returnsNewInstance() {
        Object handler = new Object();
        ReferenceType result = refTypeInstance.withContentTypeHandler(handler);
        assertNotSame(refTypeInstance, result);
        assertEquals(handler, result.getReferencedType().getTypeHandler());
    }

    // ---------- withValueHandler ----------

    @Test
    public void testWithValueHandler_sameHandler_returnsThis() {
        ReferenceType result = refTypeInstance.withValueHandler(null);
        assertSame(refTypeInstance, result);
    }

    @Test
    public void testWithValueHandler_differentHandler_returnsNewInstance() {
        Object handler = new Object();
        ReferenceType result = refTypeInstance.withValueHandler(handler);
        assertNotSame(refTypeInstance, result);
        assertEquals(handler, result.getValueHandler());
    }

    // ---------- withContentValueHandler ----------

    @Test
    public void testWithContentValueHandler_sameHandler_returnsThis() {
        ReferenceType result = refTypeInstance.withContentValueHandler(null);
        assertSame(refTypeInstance, result);
    }

    @Test
    public void testWithContentValueHandler_differentHandler_returnsNewInstance() {
        Object handler = new Object();
        ReferenceType result = refTypeInstance.withContentValueHandler(handler);
        assertNotSame(refTypeInstance, result);
        assertEquals(handler, result.getReferencedType().getValueHandler());
    }

    // ---------- withStaticTyping ----------

    @Test
    public void testWithStaticTyping_notStatic_returnsNewInstance() {
        ReferenceType result = refTypeInstance.withStaticTyping();
        assertNotSame(refTypeInstance, result);
        assertTrue(result.isStatic());
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsThis() {
        ReferenceType staticInstance = refTypeInstance.withStaticTyping();
        ReferenceType result = staticInstance.withStaticTyping();
        assertSame(staticInstance, result);
    }
}
