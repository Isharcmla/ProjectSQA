package org.mockito.internal.creation.bytebuddy;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ClassCastException;
import static org.mockito.internal.creation.bytebuddy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ByteBuddyMockMaker_resetMock_159431334415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5009;
     Object term5056;

    public ByteBuddyMockMaker_resetMock_159431334415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12506 = Class.forName((String) "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory");
        Field term12505 = ((Class) term12506).getDeclaredField((String) "FAIL_ON_REQUEST");
        ((Field) term12505).setAccessible(true);
        Object enum28 = ((Field) term12505).get((Object) null);
        Class<? extends Object> term12888 = Class.forName((String) "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory");
        Field term12887 = ((Class) term12888).getDeclaredField((String) "INSTANCE");
        ((Field) term12887).setAccessible(true);
        Object enum29 = ((Field) term12887).get((Object) null);
        Class<? extends Object> term13274 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp");
        Field term13273 = ((Class) term13274).getDeclaredField((String) "INSTANCE");
        ((Field) term13273).setAccessible(true);
        Object enum30 = ((Field) term13273).get((Object) null);
        Class<? extends Object> term13640 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod");
        Field term13639 = ((Class) term13640).getDeclaredField((String) "INSTANCE");
        ((Field) term13639).setAccessible(true);
        Object enum31 = ((Field) term13639).get((Object) null);
        term5009 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        Object term5010 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis"));
        Object term5011 = newInstance(Class.forName("org.objenesis.ObjenesisStd"));
        Object term5012 = newInstance(Class.forName("org.objenesis.strategy.StdInstantiatorStrategy"));
        Object term5013 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term5018 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator"));
        Object term5019 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term5020 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term5022 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term5023 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term5027 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5028 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5031 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator"));
        Object term5032 = newInstance(Class.forName("net.bytebuddy.ByteBuddy"));
        Object term5033 = newInstance(Class.forName("net.bytebuddy.ClassFileVersion"));
        Object term5035 = newInstance(Class.forName("net.bytebuddy.NamingStrategy$SuffixingRandom"));
        Object term5036 = newInstance(Class.forName("net.bytebuddy.instrumentation.type.TypeList$Empty"));
        Object term5038 = newInstance(Class.forName("net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction"));
        Object term5041 = newInstance(Class.forName("net.bytebuddy.asm.ClassVisitorWrapper$Chain"));
        Object term5042 = newInstance(Class.forName("net.bytebuddy.dynamic.scaffold.MethodRegistry$Default"));
        Object term5043 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Undefined"));
        Object term5046 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Defined"));
        Object term5051 = newInstance(Class.forName("java.util.Random"));
        Object term5052 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term5011, term5011.getClass(), "strategy", term5012);
        setField(term5013, term5013.getClass(), "table", null);
        setField(term5013, term5013.getClass(), "nextTable", null);
        setLongField(term5013, term5013.getClass(), "baseCount", 0L);
        setIntField(term5013, term5013.getClass(), "sizeCtl", 0);
        setIntField(term5013, term5013.getClass(), "transferIndex", 0);
        setIntField(term5013, term5013.getClass(), "cellsBusy", 0);
        setField(term5013, term5013.getClass(), "counterCells", null);
        setField(term5013, term5013.getClass(), "keySet", null);
        setField(term5013, term5013.getClass(), "values", null);
        setField(term5013, term5013.getClass(), "entrySet", null);
        setField(term5013, term5013.getClass(), "keySet", null);
        setField(term5013, term5013.getClass(), "values", null);
        setField(term5011, term5011.getClass(), "cache", term5013);
        setField(term5010, term5010.getClass(), "objenesis", term5011);
        setField(term5009, term5009.getClass(), "classInstantiator", term5010);
        setField(term5020, term5020.getClass(), "head", null);
        setField(term5020, term5020.getClass(), "tail", null);
        setIntField(term5020, term5020.getClass(), "state", 0);
        setField(term5020, term5020.getClass(), "exclusiveOwnerThread", null);
        setField(term5019, term5019.getClass(), "sync", term5020);
        setField(term5018, term5018.getClass(), "avoidingClassLeakCacheLock", term5019);
        setField(term5022, term5022.getClass(), "table", term5023);
        setIntField(term5022, term5022.getClass(), "size", 0);
        setIntField(term5022, term5022.getClass(), "threshold", 12);
        setFloatField(term5022, term5022.getClass(), "loadFactor", 0.75F);
        setField(term5027, term5027.getClass(), "lock", term5028);
        setField(term5027, term5027.getClass(), "head", null);
        setLongField(term5027, term5027.getClass(), "queueLength", 0L);
        setField(term5022, term5022.getClass(), "queue", term5027);
        setIntField(term5022, term5022.getClass(), "modCount", 0);
        setField(term5022, term5022.getClass(), "entrySet", null);
        setField(term5022, term5022.getClass(), "keySet", null);
        setField(term5022, term5022.getClass(), "values", null);
        setField(term5018, term5018.getClass(), "avoidingClassLeakageCache", term5022);
        setIntField(term5033, term5033.getClass(), "versionNumber", 49);
        setField(term5032, term5032.getClass(), "classFileVersion", term5033);
        setField(term5035, term5035.getClass(), "suffix", null);
        setField(term5035, term5035.getClass(), "javaLangPackagePrefix", null);
        setField(term5035, term5035.getClass(), "random", null);
        setField(term5032, term5032.getClass(), "namingStrategy", term5035);
        setIntField(term5036, term5036.getClass(), "modCount", 0);
        setField(term5032, term5032.getClass(), "interfaceTypes", term5036);
        setField(term5038, term5038.getClass(), "left", null);
        setField(term5038, term5038.getClass(), "right", null);
        setField(term5032, term5032.getClass(), "ignoredMethods", term5038);
        setField(term5032, term5032.getClass(), "bridgeMethodResolverFactory", enum28);
        setField(term5041, term5041.getClass(), "classVisitorWrappers", null);
        setField(term5032, term5032.getClass(), "classVisitorWrapperChain", term5041);
        setField(term5042, term5042.getClass(), "entries", null);
        setField(term5032, term5032.getClass(), "methodRegistry", term5042);
        setField(term5032, term5032.getClass(), "modifiers", term5043);
        setField(term5032, term5032.getClass(), "methodLookupEngineFactory", enum29);
        setField(term5046, term5046.getClass(), "value", null);
        setField(term5032, term5032.getClass(), "typeAttributeAppender", term5046);
        setField(term5032, term5032.getClass(), "defaultFieldAttributeAppenderFactory", enum30);
        setField(term5032, term5032.getClass(), "defaultMethodAttributeAppenderFactory", enum31);
        setField(term5031, term5031.getClass(), "byteBuddy", term5032);
        setLongField(term5052, term5052.getClass(), "value", 85220791801624L);
        setField(term5051, term5051.getClass(), "seed", term5052);
        setDoubleField(term5051, term5051.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term5051, term5051.getClass(), "haveNextNextGaussian", false);
        setField(term5031, term5031.getClass(), "random", term5051);
        setField(term5018, term5018.getClass(), "mockBytecodeGenerator", term5031);
        setField(term5009, term5009.getClass(), "cachingMockBytecodeGenerator", term5018);
        term5056 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.invocation.MockHandler");
        argTypes[2] = Class.forName("org.mockito.mock.MockCreationSettings");
        Object[] args = new Object[3];
        args[0] = term5056;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "resetMock", argTypes, term5009, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


