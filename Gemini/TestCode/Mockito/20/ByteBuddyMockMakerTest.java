package org.mockito.internal.creation.bytebuddy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

public class ByteBuddyMockMakerTest {

    private ByteBuddyMockMaker mockMaker;

    public static class SampleClass {
        public String greet() {
            return "Hello";
        }
    }

    public interface SampleInterface {
        void doSomething();
    }

    @Before
    public void setUp() {
        mockMaker = new ByteBuddyMockMaker();
    }

    @Test
    public void testConstructor_initializationSuccessful() {
        Assert.assertNotNull(mockMaker);
    }

    @Test
    public void testCreateMock_withClass_createsProxyInstance() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof SampleClass);
        Assert.assertTrue(mock instanceof MockMethodInterceptor.MockAccess);
    }

    @Test
    public void testCreateMock_withInterface_createsProxyInstance() {
        MockCreationSettings<SampleInterface> settings = createSettings(SampleInterface.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        SampleInterface mock = mockMaker.createMock(settings, handler);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof SampleInterface);
        Assert.assertTrue(mock instanceof MockMethodInterceptor.MockAccess);
    }

    @Test
    public void testCreateMock_withExtraInterfaces_implementsAllInterfaces() {
        Set<Class> extraInterfaces = new HashSet<Class>();
        extraInterfaces.add(Serializable.class);
        extraInterfaces.add(Observer.class);

        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, extraInterfaces, SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        Assert.assertNotNull(mock);
        Assert.assertTrue(mock instanceof SampleClass);
        Assert.assertTrue(mock instanceof Serializable);
        Assert.assertTrue(mock instanceof Observer);
    }

    @Test(expected = MockitoException.class)
    public void testCreateMock_acrossClassloadersSerialization_throwsMockitoException() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.ACROSS_CLASSLOADERS);
        InternalMockHandler handler = createInternalMockHandler(settings);

        mockMaker.createMock(settings, handler);
    }

    @Test(expected = MockitoException.class)
    public void testCreateMock_nonInternalMockHandler_throwsMockitoException() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        MockHandler handler = createPlainMockHandler();

        mockMaker.createMock(settings, handler);
    }

    @Test
    public void testGetHandler_validMock_returnsMockHandler() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);
        MockHandler retrievedHandler = mockMaker.getHandler(mock);

        Assert.assertNotNull(retrievedHandler);
        Assert.assertSame(handler, retrievedHandler);
    }

    @Test
    public void testGetHandler_nonMockObject_returnsNull() {
        MockHandler handler = mockMaker.getHandler("Regular String");
        Assert.assertNull(handler);
    }

    @Test
    public void testGetHandler_nullArgument_returnsNull() {
        MockHandler handler = mockMaker.getHandler(null);
        Assert.assertNull(handler);
    }

    @Test
    public void testResetMock_validMock_updatesHandler() {
        MockCreationSettings<SampleClass> settings1 = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler1 = createInternalMockHandler(settings1);

        SampleClass mock = mockMaker.createMock(settings1, handler1);
        Assert.assertSame(handler1, mockMaker.getHandler(mock));

        MockCreationSettings<SampleClass> settings2 = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler2 = createInternalMockHandler(settings2);

        mockMaker.resetMock(mock, handler2, settings2);
        Assert.assertSame(handler2, mockMaker.getHandler(mock));
    }

    @Test(expected = MockitoException.class)
    public void testResetMock_nonInternalMockHandler_throwsMockitoException() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        SampleClass mock = mockMaker.createMock(settings, handler);

        MockHandler plainHandler = createPlainMockHandler();
        mockMaker.resetMock(mock, plainHandler, settings);
    }

    @Test(expected = ClassCastException.class)
    public void testResetMock_nonMockObject_throwsClassCastException() {
        MockCreationSettings<SampleClass> settings = createSettings(SampleClass.class, Collections.<Class>emptySet(), SerializableMode.NONE);
        InternalMockHandler handler = createInternalMockHandler(settings);

        mockMaker.resetMock("Not a mock", handler, settings);
    }

    @Test
    public void testDescribeClass_withClassAndObject_reflectionCoverage() throws Exception {
        Method describeClassMethod = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Class.class);
        describeClassMethod.setAccessible(true);

        String nullClassDesc = (String) describeClassMethod.invoke(null, new Object[]{null});
        Assert.assertEquals("null", nullClassDesc);

        String validClassDesc = (String) describeClassMethod.invoke(null, String.class);
        Assert.assertTrue(validClassDesc.contains("java.lang.String"));

        Method describeObjectMethod = ByteBuddyMockMaker.class.getDeclaredMethod("describeClass", Object.class);
        describeObjectMethod.setAccessible(true);

        String nullObjDesc = (String) describeObjectMethod.invoke(null, new Object[]{null});
        Assert.assertEquals("null", nullObjDesc);

        String validObjDesc = (String) describeObjectMethod.invoke(null, "TestInstance");
        Assert.assertTrue(validObjDesc.contains("java.lang.String"));
    }

    @SuppressWarnings("unchecked")
    private <T> MockCreationSettings<T> createSettings(final Class<T> typeToMock, final Set<Class> extraInterfaces, final SerializableMode serializableMode) {
        return (MockCreationSettings<T>) Proxy.newProxyInstance(
                MockCreationSettings.class.getClassLoader(),
                new Class<?>[]{MockCreationSettings.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getTypeToMock".equals(name)) {
                            return typeToMock;
                        }
                        if ("getExtraInterfaces".equals(name)) {
                            return extraInterfaces != null ? extraInterfaces : Collections.emptySet();
                        }
                        if ("getSerializableMode".equals(name)) {
                            return serializableMode != null ? serializableMode : SerializableMode.NONE;
                        }
                        if ("isUsingConstructor".equals(name)) {
                            return false;
                        }
                        if ("isStubOnly".equals(name)) {
                            return false;
                        }
                        if ("isStripAnnotations".equals(name)) {
                            return false;
                        }
                        if ("getInvocationListeners".equals(name)) {
                            return Collections.emptyList();
                        }
                        return null;
                    }
                }
        );
    }

    private InternalMockHandler createInternalMockHandler(final MockCreationSettings<?> settings) {
        return (InternalMockHandler) Proxy.newProxyInstance(
                InternalMockHandler.class.getClassLoader(),
                new Class<?>[]{InternalMockHandler.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getMockSettings".equals(name)) {
                            return settings;
                        }
                        if ("equals".equals(name)) {
                            return proxy == args[0];
                        }
                        if ("hashCode".equals(name)) {
                            return System.identityHashCode(proxy);
                        }
                        if ("toString".equals(name)) {
                            return "DummyInternalMockHandler";
                        }
                        return null;
                    }
                }
        );
    }

    private MockHandler createPlainMockHandler() {
        return (MockHandler) Proxy.newProxyInstance(
                MockHandler.class.getClassLoader(),
                new Class<?>[]{MockHandler.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
    }
}
