package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

public class ReturnsDeepStubsTest {

    private ReturnsDeepStubs returnsDeepStubs;

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    interface Level3 {
        String getValue();
    }

    interface Level2 {
        Level3 getLevel3();
        int getPrimitiveInt();
        final class FinalType {}
        FinalType getFinalType();
    }

    interface Level1 {
        Level2 getLevel2();
        String getString();
        boolean getBoolean();
        long getLong();
    }

    interface GenericContainer<T, N extends Number> {
        T getItem();
        N getNumber();
        List<T> getList();
    }

    interface StringContainer extends GenericContainer<String, Integer> {}

    interface ComplexBoundedGeneric<K extends Comparable<K> & Cloneable> {
        K getBounded();
    }

    @Test
    public void testAnswer_chainedDeepStubs_returnsNonNullChainedMock() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        Level2 level2 = mock.getLevel2();
        assertNotNull(level2);

        Level3 level3 = level2.getLevel3();
        assertNotNull(level3);
    }

    @Test
    public void testAnswer_primitiveAndNonMockableTypes_returnsDefaultValues() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        assertEquals("", mock.getString());
        assertEquals(false, mock.getBoolean());
        assertEquals(0L, mock.getLong());
        assertEquals(0, mock.getLevel2().getPrimitiveInt());
    }

    @Test
    public void testAnswer_finalClassReturnType_returnsNullOrEmpty() {
        Level2 mock = mock(Level2.class, returnsDeepStubs);

        Level2.FinalType finalType = mock.getFinalType();
        assertNull(finalType);
    }

    @Test
    public void testAnswer_reuseExistingDeepStubInstance_returnsSameInstance() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        Level2 firstCall = mock.getLevel2();
        Level2 secondCall = mock.getLevel2();

        assertSame(firstCall, secondCall);
    }

    @Test
    public void testAnswer_stubbedMethodOnDeepStub_returnsStubbedValue() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        when(mock.getLevel2().getLevel3().getValue()).thenReturn("deep-stubbed-result");

        assertEquals("deep-stubbed-result", mock.getLevel2().getLevel3().getValue());
    }

    @Test
    public void testAnswer_withGenericsMetadata_resolvesCorrectType() {
        StringContainer mock = mock(StringContainer.class, returnsDeepStubs);

        assertEquals("", mock.getItem());
        assertNull(mock.getNumber());
        assertNotNull(mock.getList());
        assertTrue(mock.getList().isEmpty());
    }

    @Test
    public void testAnswer_withMultipleBoundsGenerics_createsMockWithExtraInterfaces() {
        ComplexBoundedGeneric<?> mock = mock(ComplexBoundedGeneric.class, returnsDeepStubs);

        Object bounded = mock.getBounded();
        assertNotNull(bounded);
        assertTrue(bounded instanceof Comparable);
        assertTrue(bounded instanceof Cloneable);
    }

    @Test
    public void testActualParameterizedType_withDirectMock_returnsValidGenericMetadataSupport() {
        Level1 mock = mock(Level1.class, returnsDeepStubs);

        GenericMetadataSupport metadataSupport = returnsDeepStubs.actualParameterizedType(mock);

        assertNotNull(metadataSupport);
        assertEquals(Level1.class, metadataSupport.rawType());
    }

    @Test(expected = RuntimeException.class)
    public void testAnswer_withNullInvocation_throwsException() throws Throwable {
        returnsDeepStubs.answer(null);
    }

    @Test
    public void testSerialization_returnsFunctionalAnswerAfterDeserialization() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsDeepStubs);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ReturnsDeepStubs deserializedAnswer = (ReturnsDeepStubs) ois.readObject();

        assertNotNull(deserializedAnswer);

        Level1 mock = mock(Level1.class, deserializedAnswer);
        assertNotNull(mock.getLevel2());
        assertEquals("", mock.getString());
    }
}
