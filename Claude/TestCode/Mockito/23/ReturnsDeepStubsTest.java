package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

public class ReturnsDeepStubsTest {

    // Sample interfaces used to exercise the deep stub behaviour.
    public interface SampleRepository {
        String getValue();
    }

    public interface SampleService {
        SampleRepository getRepository();
        String getName();
        int getCount();
        List<String> getItems();
    }

    private ReturnsDeepStubs returnsDeepStubs;

    @Before
    public void setUp() {
        returnsDeepStubs = new ReturnsDeepStubs();
    }

    // ---------------------------------------------------------------
    // Tests for answer(InvocationOnMock) - normal cases
    // ---------------------------------------------------------------

    @Test
    public void testAnswer_methodReturningMockableType_returnsNonNullDeepStubMock() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        SampleRepository repository = service.getRepository();

        assertNotNull(repository);
    }

    @Test
    public void testAnswer_nestedDeepStub_returnsEmptyStringForUnmockableStringType() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        String value = service.getRepository().getValue();

        assertEquals("", value);
    }

    @Test
    public void testAnswer_methodReturningPrimitiveInt_returnsDefaultZero() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        int count = service.getCount();

        assertEquals(0, count);
    }

    @Test
    public void testAnswer_methodReturningString_returnsEmptyStringDirectly() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        String name = service.getName();

        assertEquals("", name);
    }

    @Test
    public void testAnswer_methodReturningListType_sizeReturnsZero() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        List<String> items = service.getItems();

        assertNotNull(items);
        assertEquals(0, items.size());
    }

    // ---------------------------------------------------------------
    // Edge case: repeated invocation should return the same deep stub instance
    // (exercises the "stubbed invocation matches" branch in getMock())
    // ---------------------------------------------------------------

    @Test
    public void testAnswer_sameInvocationCalledTwice_returnsSameMockInstance() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        SampleRepository first = service.getRepository();
        SampleRepository second = service.getRepository();

        assertSame(first, second);
    }

    @Test
    public void testAnswer_usingMockitoReturnsDeepStubsConstant_worksAsExpected() {
        SampleService service = mock(SampleService.class, RETURNS_DEEP_STUBS);

        SampleRepository repository = service.getRepository();
        String value = repository.getValue();

        assertNotNull(repository);
        assertEquals("", value);
    }

    // ---------------------------------------------------------------
    // Tests for actualParameterizedType(Object) - protected method,
    // accessible because this test resides in the same package.
    // ---------------------------------------------------------------

    @Test
    public void testActualParameterizedType_withRealMock_returnsMetadataWithCorrectRawType() {
        SampleService mockObject = mock(SampleService.class);

        GenericMetadataSupport metadata = returnsDeepStubs.actualParameterizedType(mockObject);

        assertNotNull(metadata);
        assertEquals(SampleService.class, metadata.rawType());
    }

    @Test
    public void testActualParameterizedType_withNullMock_throwsException() {
        try {
            returnsDeepStubs.actualParameterizedType(null);
            fail("Expected an exception to be thrown when passing null mock");
        } catch (Exception e) {
            // expected - behaviour depends on internal MockUtil implementation,
            // but calling on a null object must not succeed silently.
            assertNotNull(e);
        }
    }

    @Test
    public void testActualParameterizedType_withNonMockObject_throwsException() {
        Object notAMock = new Object();

        try {
            returnsDeepStubs.actualParameterizedType(notAMock);
            fail("Expected an exception to be thrown when passing a non-mock object");
        } catch (Exception e) {
            // expected - plain objects are not mocks and have no mock handler.
            assertNotNull(e);
        }
    }

    // ---------------------------------------------------------------
    // Edge case: calling answer() flow where method return type is final
    // (String) - this covers the branch where rawType is NOT mockable.
    // ---------------------------------------------------------------

    @Test
    public void testAnswer_unmockableReturnType_doesNotCreateDeepStubMock() {
        SampleService service = mock(SampleService.class, withSettings().defaultAnswer(returnsDeepStubs));

        String name1 = service.getName();
        String name2 = service.getName();

        assertEquals(name1, name2);
        assertEquals("", name1);
    }
}
