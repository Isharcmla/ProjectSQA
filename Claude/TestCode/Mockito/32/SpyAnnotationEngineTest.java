import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.Captor;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
    }

    // ---------- Fixture classes ----------

    static class HasSpyField {
        @Spy
        List<String> list = new LinkedList<String>();
    }

    static class HasNullSpyField {
        @Spy
        List<String> list = null;
    }

    static class HasAlreadyMockedSpyField {
        @Spy
        List<String> list = Mockito.mock(List.class);
    }

    @SuppressWarnings("deprecation")
    static class HasSpyAndMockField {
        @Spy
        @Mock
        List<String> list = new LinkedList<String>();
    }

    static class NoAnnotationField {
        List<String> list = new LinkedList<String>();
    }

    static class HasSpyAndCaptorField {
        @Spy
        @Captor
        List<String> list = new LinkedList<String>();
    }

    // ---------- Tests for createMockFor ----------

    @Test
    public void testCreateMockFor_anyAnnotationAndField_returnsNull() {
        Object result = engine.createMockFor(null, null);
        assertNull(result);
    }

    // ---------- Tests for process ----------

    @Test
    public void testProcess_withValidSpyField_createsSpy() throws Exception {
        HasSpyField testClass = new HasSpyField();
        engine.process(HasSpyField.class, testClass);

        assertNotNull(testClass.list);
        assertTrue(new org.mockito.internal.util.MockUtil().isMock(testClass.list));
    }

    @Test(expected = MockitoException.class)
    public void testProcess_withNullInstance_throwsMockitoException() {
        HasNullSpyField testClass = new HasNullSpyField();
        engine.process(HasNullSpyField.class, testClass);
    }

    @Test
    public void testProcess_withAlreadyMockedSpyField_resetsMock() {
        HasAlreadyMockedSpyField testClass = new HasAlreadyMockedSpyField();
        Object originalMock = testClass.list;

        engine.process(HasAlreadyMockedSpyField.class, testClass);

        assertSame(originalMock, testClass.list);
        assertTrue(new org.mockito.internal.util.MockUtil().isMock(testClass.list));
    }

    @Test(expected = MockitoException.class)
    public void testProcess_withSpyAndMockAnnotation_throwsMockitoException() {
        HasSpyAndMockField testClass = new HasSpyAndMockField();
        engine.process(HasSpyAndMockField.class, testClass);
    }

    @Test(expected = MockitoException.class)
    public void testProcess_withSpyAndCaptorAnnotation_throwsMockitoException() {
        HasSpyAndCaptorField testClass = new HasSpyAndCaptorField();
        engine.process(HasSpyAndCaptorField.class, testClass);
    }

    @Test
    public void testProcess_withNoSpyFields_doesNothing() {
        NoAnnotationField testClass = new NoAnnotationField();
        List<String> originalList = testClass.list;

        engine.process(NoAnnotationField.class, testClass);

        assertSame(originalList, testClass.list);
        assertFalse(new org.mockito.internal.util.MockUtil().isMock(testClass.list));
    }

    @Test
    public void testProcess_withEmptyClass_doesNotThrow() {
        class EmptyClass {
        }
        EmptyClass testClass = new EmptyClass();
        engine.process(EmptyClass.class, testClass);
        // should complete without any exception
        assertTrue(true);
    }

    // ---------- Tests for assertNoAnnotations (package-private method) ----------

    @Test
    public void testAssertNoAnnotations_noConflict_doesNotThrow() throws Exception {
        Field field = NoAnnotationField.class.getDeclaredField("list");
        engine.assertNoAnnotations(Spy.class, field, Mock.class, Captor.class);
        // no exception expected
        assertTrue(true);
    }

    @Test(expected = MockitoException.class)
    public void testAssertNoAnnotations_withConflict_throwsException() throws Exception {
        Field field = HasSpyAndMockField.class.getDeclaredField("list");
        engine.assertNoAnnotations(Spy.class, field, Mock.class, Captor.class);
    }
}
