import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JUnit 4 test suite for org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs
 *
 * หมายเหตุ: ไม่ได้ใช้ mocking framework ภายนอกใด ๆ ในการสร้าง test double
 * แต่ใช้ Mockito.mock(...) ร่วมกับ ReturnsDeepStubs ซึ่งเป็น feature ของ Mockito เอง
 * ที่กำลังถูกทดสอบโดยตรง (เป็น public API ของคลาสจริง ไม่ใช่ mocking framework แยก)
 */
public class ReturnsDeepStubsTest {

    // ---------- Sample interfaces used for testing deep stubs ----------

    public interface Bar {
        String getValue();
    }

    public interface Foo {
        Bar getBar();
        String getString();
        int getInt();
        List<String> getList();
    }

    public interface GenericsNest<K extends Comparable<K>> extends Map<K, Set<Number>> {
    }

    private ReturnsDeepStubs answer;

    @Before
    public void setUp() {
        answer = new ReturnsDeepStubs();
    }

    // ---------------- (ก) Normal / typical input ----------------

    @Test
    public void testAnswer_nestedMockableReturnType_returnsNonNullMock() {
        Foo foo = Mockito.mock(Foo.class, answer);
        Bar bar = foo.getBar();
        assertNotNull(bar);
        assertTrue(new MockUtil().isMock(bar));
    }

    @Test
    public void testAnswer_sameInvocationTwice_returnsSameDeepStubMock() {
        Foo foo = Mockito.mock(Foo.class, answer);
        Bar bar1 = foo.getBar();
        Bar bar2 = foo.getBar();
        assertSame(bar1, bar2);
    }

    @Test
    public void testAnswer_nestedCallChain_returnsConsistentDeepStub() {
        Foo foo = Mockito.mock(Foo.class, answer);
        // chain two levels deep
        String value1 = foo.getBar().getValue();
        String value2 = foo.getBar().getValue();
        // getValue() is not mockable in a meaningful way for deep stub chain here (String final type),
        // so default answer should be null, but should be consistent (no exception)
        assertNull(value1);
        assertNull(value2);
    }

    @Test
    public void testAnswer_deepStubMockIsSerializable() {
        Foo foo = Mockito.mock(Foo.class, answer);
        Bar bar = foo.getBar();
        assertTrue(bar instanceof Serializable);
    }

    @Test
    public void testAnswer_listReturnType_returnsMockedList() {
        Foo foo = Mockito.mock(Foo.class, answer);
        List<String> list = foo.getList();
        assertNotNull(list);
        assertTrue(new MockUtil().isMock(list));
    }

    // ---------------- (ข) Edge case: null / 0 / boundary / default values ----------------

    @Test
    public void testAnswer_nonMockableStringReturnType_returnsNullDefault() {
        Foo foo = Mockito.mock(Foo.class, answer);
        String result = foo.getString();
        assertNull(result);
    }

    @Test
    public void testAnswer_primitiveIntReturnType_returnsZeroDefault() {
        Foo foo = Mockito.mock(Foo.class, answer);
        int result = foo.getInt();
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_explicitStubOverridesDeepStub_returnsStubbedValue() {
        Foo foo = Mockito.mock(Foo.class, answer);
        Bar explicitBar = Mockito.mock(Bar.class);
        Mockito.when(foo.getBar()).thenReturn(explicitBar);

        Bar result = foo.getBar();
        assertSame(explicitBar, result);
    }

    @Test
    public void testAnswer_genericNestedReturnType_doesNotThrow() {
        GenericsNest<?> mock = Mockito.mock(GenericsNest.class, answer);
        try {
            // Attempt to navigate generic deep stub chain; should not throw unexpected exceptions.
            Object entry = mock.entrySet();
            assertNotNull(entry);
        } catch (Exception e) {
            fail("Deep stub with generics should not throw an unexpected exception: " + e);
        }
    }

    @Test
    public void testActualParameterizedType_onValidMock_returnsMetadataNotNull() {
        Foo foo = Mockito.mock(Foo.class, answer);
        Object metadata = answer.actualParameterizedType(foo);
        assertNotNull(metadata);
    }

    // ---------------- (ค) Exception cases ----------------

    @Test(expected = RuntimeException.class)
    public void testActualParameterizedType_onNonMockObject_throwsException() {
        // Passing a plain object (not a mock) should cause MockUtil().getMockHandler(mock) to throw.
        answer.actualParameterizedType(new Object());
    }

    @Test(expected = RuntimeException.class)
    public void testActualParameterizedType_onNullObject_throwsException() {
        answer.actualParameterizedType(null);
    }

    @Test
    public void testAnswer_multipleDistinctDeepStubs_areNotSameInstance() {
        Foo foo1 = Mockito.mock(Foo.class, answer);
        Foo foo2 = Mockito.mock(Foo.class, answer);

        Bar bar1 = foo1.getBar();
        Bar bar2 = foo2.getBar();

        assertNotNull(bar1);
        assertNotNull(bar2);
        assertNotSame(bar1, bar2);
    }
}
