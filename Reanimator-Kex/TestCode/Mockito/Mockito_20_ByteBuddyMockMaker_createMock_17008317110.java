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
import java.lang.NullPointerException;
import static org.mockito.internal.creation.bytebuddy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ByteBuddyMockMaker_createMock_17008317110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ByteBuddyMockMaker_createMock_17008317110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6896 = Class.forName((String) "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory");
        Field term6895 = ((Class) term6896).getDeclaredField((String) "FAIL_ON_REQUEST");
        ((Field) term6895).setAccessible(true);
        Object enum16 = ((Field) term6895).get((Object) null);
        Class<? extends Object> term7278 = Class.forName((String) "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory");
        Field term7277 = ((Class) term7278).getDeclaredField((String) "INSTANCE");
        ((Field) term7277).setAccessible(true);
        Object enum17 = ((Field) term7277).get((Object) null);
        Class<? extends Object> term7664 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp");
        Field term7663 = ((Class) term7664).getDeclaredField((String) "INSTANCE");
        ((Field) term7663).setAccessible(true);
        Object enum18 = ((Field) term7663).get((Object) null);
        Class<? extends Object> term8030 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod");
        Field term8029 = ((Class) term8030).getDeclaredField((String) "INSTANCE");
        ((Field) term8029).setAccessible(true);
        Object enum19 = ((Field) term8029).get((Object) null);
        term1 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        Object term2 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis"));
        Object term3 = newInstance(Class.forName("org.objenesis.ObjenesisStd"));
        Object term4 = newInstance(Class.forName("org.objenesis.strategy.StdInstantiatorStrategy"));
        Object term5 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term10 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator"));
        Object term11 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term12 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term14 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term15 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term19 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term20 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term23 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator"));
        Object term24 = newInstance(Class.forName("net.bytebuddy.ByteBuddy"));
        Object term25 = newInstance(Class.forName("net.bytebuddy.ClassFileVersion"));
        Object term27 = newInstance(Class.forName("net.bytebuddy.NamingStrategy$SuffixingRandom"));
        Object term28 = newInstance(Class.forName("net.bytebuddy.instrumentation.type.TypeList$Empty"));
        Object term30 = newInstance(Class.forName("net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction"));
        Object term33 = newInstance(Class.forName("net.bytebuddy.asm.ClassVisitorWrapper$Chain"));
        Object term34 = newInstance(Class.forName("net.bytebuddy.dynamic.scaffold.MethodRegistry$Default"));
        Object term35 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Undefined"));
        Object term38 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Defined"));
        Object term43 = newInstance(Class.forName("java.util.Random"));
        Object term44 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term3, term3.getClass(), "strategy", term4);
        setField(term5, term5.getClass(), "table", null);
        setField(term5, term5.getClass(), "nextTable", null);
        setLongField(term5, term5.getClass(), "baseCount", 0L);
        setIntField(term5, term5.getClass(), "sizeCtl", 0);
        setIntField(term5, term5.getClass(), "transferIndex", 0);
        setIntField(term5, term5.getClass(), "cellsBusy", 0);
        setField(term5, term5.getClass(), "counterCells", null);
        setField(term5, term5.getClass(), "keySet", null);
        setField(term5, term5.getClass(), "values", null);
        setField(term5, term5.getClass(), "entrySet", null);
        setField(term5, term5.getClass(), "keySet", null);
        setField(term5, term5.getClass(), "values", null);
        setField(term3, term3.getClass(), "cache", term5);
        setField(term2, term2.getClass(), "objenesis", term3);
        setField(term1, term1.getClass(), "classInstantiator", term2);
        setField(term12, term12.getClass(), "head", null);
        setField(term12, term12.getClass(), "tail", null);
        setIntField(term12, term12.getClass(), "state", 0);
        setField(term12, term12.getClass(), "exclusiveOwnerThread", null);
        setField(term11, term11.getClass(), "sync", term12);
        setField(term10, term10.getClass(), "avoidingClassLeakCacheLock", term11);
        setField(term14, term14.getClass(), "table", term15);
        setIntField(term14, term14.getClass(), "size", 0);
        setIntField(term14, term14.getClass(), "threshold", 12);
        setFloatField(term14, term14.getClass(), "loadFactor", 0.75F);
        setField(term19, term19.getClass(), "lock", term20);
        setField(term19, term19.getClass(), "head", null);
        setLongField(term19, term19.getClass(), "queueLength", 0L);
        setField(term14, term14.getClass(), "queue", term19);
        setIntField(term14, term14.getClass(), "modCount", 0);
        setField(term14, term14.getClass(), "entrySet", null);
        setField(term14, term14.getClass(), "keySet", null);
        setField(term14, term14.getClass(), "values", null);
        setField(term10, term10.getClass(), "avoidingClassLeakageCache", term14);
        setIntField(term25, term25.getClass(), "versionNumber", 49);
        setField(term24, term24.getClass(), "classFileVersion", term25);
        setField(term27, term27.getClass(), "suffix", null);
        setField(term27, term27.getClass(), "javaLangPackagePrefix", null);
        setField(term27, term27.getClass(), "random", null);
        setField(term24, term24.getClass(), "namingStrategy", term27);
        setIntField(term28, term28.getClass(), "modCount", 0);
        setField(term24, term24.getClass(), "interfaceTypes", term28);
        setField(term30, term30.getClass(), "left", null);
        setField(term30, term30.getClass(), "right", null);
        setField(term24, term24.getClass(), "ignoredMethods", term30);
        setField(term24, term24.getClass(), "bridgeMethodResolverFactory", enum16);
        setField(term33, term33.getClass(), "classVisitorWrappers", null);
        setField(term24, term24.getClass(), "classVisitorWrapperChain", term33);
        setField(term34, term34.getClass(), "entries", null);
        setField(term24, term24.getClass(), "methodRegistry", term34);
        setField(term24, term24.getClass(), "modifiers", term35);
        setField(term24, term24.getClass(), "methodLookupEngineFactory", enum17);
        setField(term38, term38.getClass(), "value", null);
        setField(term24, term24.getClass(), "typeAttributeAppender", term38);
        setField(term24, term24.getClass(), "defaultFieldAttributeAppenderFactory", enum18);
        setField(term24, term24.getClass(), "defaultMethodAttributeAppenderFactory", enum19);
        setField(term23, term23.getClass(), "byteBuddy", term24);
        setLongField(term44, term44.getClass(), "value", 267449463431814L);
        setField(term43, term43.getClass(), "seed", term44);
        setDoubleField(term43, term43.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term43, term43.getClass(), "haveNextNextGaussian", false);
        setField(term23, term23.getClass(), "random", term43);
        setField(term10, term10.getClass(), "mockBytecodeGenerator", term23);
        setField(term1, term1.getClass(), "cachingMockBytecodeGenerator", term10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.mock.MockCreationSettings");
        argTypes[1] = Class.forName("org.mockito.invocation.MockHandler");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createMock", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


