package org.mockito.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine engine = new DefaultInjectionEngine();

    // ---------- Fixture classes ----------

    static class Service {
    }

    static class ServiceUser {
        Service service;
    }

    static class TestClassWithField {
        ServiceUser serviceUser;
    }

    static class TestClassWithTwoFields {
        ServiceUser serviceUser1;
        ServiceUser serviceUser2;
    }

    static class BaseUser {
        Service service;
    }

    static class SubUser extends BaseUser {
    }

    static class TestClassWithSubUserField {
        SubUser subUser;
    }

    interface SomeInterface {
    }

    static class TestClassWithInterfaceField {
        SomeInterface someInterface;
    }

    // ---------- Normal / typical cases ----------

    @Test
    public void testInjectMocksOnFields_normalInjection_mockInjectedSuccessfully() throws Exception {
        TestClassWithField testClassInstance = new TestClassWithField();
        Field field = TestClassWithField.class.getDeclaredField("serviceUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Service mockService = new Service();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockService);

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNotNull(testClassInstance.serviceUser);
        assertSame(mockService, testClassInstance.serviceUser.service);
    }

    @Test
    public void testInjectMocksOnFields_fieldInSuperclass_injectedSuccessfully() throws Exception {
        TestClassWithSubUserField testClassInstance = new TestClassWithSubUserField();
        Field field = TestClassWithSubUserField.class.getDeclaredField("subUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Service mockService = new Service();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockService);

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNotNull(testClassInstance.subUser);
        assertSame(mockService, testClassInstance.subUser.service);
    }

    @Test
    public void testInjectMocksOnFields_multipleInjectMocksFields_eachFieldInjectedIndependently() throws Exception {
        TestClassWithTwoFields testClassInstance = new TestClassWithTwoFields();
        Field field1 = TestClassWithTwoFields.class.getDeclaredField("serviceUser1");
        Field field2 = TestClassWithTwoFields.class.getDeclaredField("serviceUser2");
        field1.setAccessible(true);
        field2.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field1);
        injectMocksFields.add(field2);

        Service mockService = new Service();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockService);

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNotNull(testClassInstance.serviceUser1);
        assertNotNull(testClassInstance.serviceUser2);
        assertSame(mockService, testClassInstance.serviceUser1.service);
        assertSame(mockService, testClassInstance.serviceUser2.service);
    }

    // ---------- Edge cases ----------

    @Test
    public void testInjectMocksOnFields_emptyInjectMocksFields_noExceptionAndNoChange() {
        Set<Field> injectMocksFields = new HashSet<Field>();
        Set<Object> mocks = new HashSet<Object>();
        TestClassWithField testClassInstance = new TestClassWithField();

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNull(testClassInstance.serviceUser);
    }

    @Test
    public void testInjectMocksOnFields_emptyMocksSet_fieldInitializedButNotInjected() throws Exception {
        TestClassWithField testClassInstance = new TestClassWithField();
        Field field = TestClassWithField.class.getDeclaredField("serviceUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Set<Object> mocks = new HashSet<Object>();

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNotNull(testClassInstance.serviceUser);
        assertNull(testClassInstance.serviceUser.service);
    }

    @Test
    public void testInjectMocksOnFields_multipleMocksOfSameType_fieldInstanceCreatedWithoutCrash() throws Exception {
        TestClassWithField testClassInstance = new TestClassWithField();
        Field field = TestClassWithField.class.getDeclaredField("serviceUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new Service());
        mocks.add(new Service());

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        assertNotNull(testClassInstance.serviceUser);
    }

    // ---------- Exception cases ----------

    @Test(expected = NullPointerException.class)
    public void testInjectMocksOnFields_nullMocksSet_throwsNullPointerException() throws Exception {
        TestClassWithField testClassInstance = new TestClassWithField();
        Field field = TestClassWithField.class.getDeclaredField("serviceUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        engine.injectMocksOnFields(injectMocksFields, null, testClassInstance);
    }

    @Test(expected = NullPointerException.class)
    public void testInjectMocksOnFields_nullInjectMocksFields_throwsNullPointerException() {
        TestClassWithField testClassInstance = new TestClassWithField();
        Set<Object> mocks = new HashSet<Object>();

        engine.injectMocksOnFields(null, mocks, testClassInstance);
    }

    @Test(expected = MockitoException.class)
    public void testInjectMocksOnFields_cannotInitializeInterfaceField_throwsMockitoException() throws Exception {
        TestClassWithInterfaceField testClassInstance = new TestClassWithInterfaceField();
        Field field = TestClassWithInterfaceField.class.getDeclaredField("someInterface");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Set<Object> mocks = new HashSet<Object>();

        engine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);
    }

    @Test(expected = NullPointerException.class)
    public void testInjectMocksOnFields_nullTestClassInstance_throwsNullPointerException() throws Exception {
        TestClassWithField dummy = new TestClassWithField();
        Field field = TestClassWithField.class.getDeclaredField("serviceUser");
        field.setAccessible(true);

        Set<Field> injectMocksFields = new HashSet<Field>();
        injectMocksFields.add(field);

        Set<Object> mocks = new HashSet<Object>();

        engine.injectMocksOnFields(injectMocksFields, mocks, null);
    }
}
