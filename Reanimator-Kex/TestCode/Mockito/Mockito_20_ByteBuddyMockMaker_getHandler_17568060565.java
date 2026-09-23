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
import static org.mockito.internal.creation.bytebuddy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ByteBuddyMockMaker_getHandler_17568060565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3389;
     Object term3436;

    public ByteBuddyMockMaker_getHandler_17568060565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3438 = Class.forName((String) "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory");
        Field term3437 = ((Class) term3438).getDeclaredField((String) "FAIL_FAST");
        ((Field) term3437).setAccessible(true);
        Object enum8 = ((Field) term3437).get((Object) null);
        Class<? extends Object> term3802 = Class.forName((String) "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory");
        Field term3801 = ((Class) term3802).getDeclaredField((String) "INSTANCE");
        ((Field) term3801).setAccessible(true);
        Object enum9 = ((Field) term3801).get((Object) null);
        Class<? extends Object> term4188 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp");
        Field term4187 = ((Class) term4188).getDeclaredField((String) "INSTANCE");
        ((Field) term4187).setAccessible(true);
        Object enum10 = ((Field) term4187).get((Object) null);
        Class<? extends Object> term4554 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod");
        Field term4553 = ((Class) term4554).getDeclaredField((String) "INSTANCE");
        ((Field) term4553).setAccessible(true);
        Object enum11 = ((Field) term4553).get((Object) null);
        term3389 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        Object term3390 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis"));
        Object term3391 = newInstance(Class.forName("org.objenesis.ObjenesisStd"));
        Object term3392 = newInstance(Class.forName("org.objenesis.strategy.StdInstantiatorStrategy"));
        Object term3393 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term3398 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator"));
        Object term3399 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term3400 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term3402 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term3403 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term3407 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3408 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3411 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator"));
        Object term3412 = newInstance(Class.forName("net.bytebuddy.ByteBuddy"));
        Object term3413 = newInstance(Class.forName("net.bytebuddy.ClassFileVersion"));
        Object term3415 = newInstance(Class.forName("net.bytebuddy.NamingStrategy$SuffixingRandom"));
        Object term3416 = newInstance(Class.forName("net.bytebuddy.instrumentation.type.TypeList$Empty"));
        Object term3418 = newInstance(Class.forName("net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction"));
        Object term3421 = newInstance(Class.forName("net.bytebuddy.asm.ClassVisitorWrapper$Chain"));
        Object term3422 = newInstance(Class.forName("net.bytebuddy.dynamic.scaffold.MethodRegistry$Default"));
        Object term3423 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Undefined"));
        Object term3426 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Defined"));
        Object term3431 = newInstance(Class.forName("java.util.Random"));
        Object term3432 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term3391, term3391.getClass(), "strategy", term3392);
        setField(term3393, term3393.getClass(), "table", null);
        setField(term3393, term3393.getClass(), "nextTable", null);
        setLongField(term3393, term3393.getClass(), "baseCount", 0L);
        setIntField(term3393, term3393.getClass(), "sizeCtl", 0);
        setIntField(term3393, term3393.getClass(), "transferIndex", 0);
        setIntField(term3393, term3393.getClass(), "cellsBusy", 0);
        setField(term3393, term3393.getClass(), "counterCells", null);
        setField(term3393, term3393.getClass(), "keySet", null);
        setField(term3393, term3393.getClass(), "values", null);
        setField(term3393, term3393.getClass(), "entrySet", null);
        setField(term3393, term3393.getClass(), "keySet", null);
        setField(term3393, term3393.getClass(), "values", null);
        setField(term3391, term3391.getClass(), "cache", term3393);
        setField(term3390, term3390.getClass(), "objenesis", term3391);
        setField(term3389, term3389.getClass(), "classInstantiator", term3390);
        setField(term3400, term3400.getClass(), "head", null);
        setField(term3400, term3400.getClass(), "tail", null);
        setIntField(term3400, term3400.getClass(), "state", 0);
        setField(term3400, term3400.getClass(), "exclusiveOwnerThread", null);
        setField(term3399, term3399.getClass(), "sync", term3400);
        setField(term3398, term3398.getClass(), "avoidingClassLeakCacheLock", term3399);
        setField(term3402, term3402.getClass(), "table", term3403);
        setIntField(term3402, term3402.getClass(), "size", 0);
        setIntField(term3402, term3402.getClass(), "threshold", 12);
        setFloatField(term3402, term3402.getClass(), "loadFactor", 0.75F);
        setField(term3407, term3407.getClass(), "lock", term3408);
        setField(term3407, term3407.getClass(), "head", null);
        setLongField(term3407, term3407.getClass(), "queueLength", 0L);
        setField(term3402, term3402.getClass(), "queue", term3407);
        setIntField(term3402, term3402.getClass(), "modCount", 0);
        setField(term3402, term3402.getClass(), "entrySet", null);
        setField(term3402, term3402.getClass(), "keySet", null);
        setField(term3402, term3402.getClass(), "values", null);
        setField(term3398, term3398.getClass(), "avoidingClassLeakageCache", term3402);
        setIntField(term3413, term3413.getClass(), "versionNumber", 49);
        setField(term3412, term3412.getClass(), "classFileVersion", term3413);
        setField(term3415, term3415.getClass(), "suffix", null);
        setField(term3415, term3415.getClass(), "javaLangPackagePrefix", null);
        setField(term3415, term3415.getClass(), "random", null);
        setField(term3412, term3412.getClass(), "namingStrategy", term3415);
        setIntField(term3416, term3416.getClass(), "modCount", 0);
        setField(term3412, term3412.getClass(), "interfaceTypes", term3416);
        setField(term3418, term3418.getClass(), "left", null);
        setField(term3418, term3418.getClass(), "right", null);
        setField(term3412, term3412.getClass(), "ignoredMethods", term3418);
        setField(term3412, term3412.getClass(), "bridgeMethodResolverFactory", enum8);
        setField(term3421, term3421.getClass(), "classVisitorWrappers", null);
        setField(term3412, term3412.getClass(), "classVisitorWrapperChain", term3421);
        setField(term3422, term3422.getClass(), "entries", null);
        setField(term3412, term3412.getClass(), "methodRegistry", term3422);
        setField(term3412, term3412.getClass(), "modifiers", term3423);
        setField(term3412, term3412.getClass(), "methodLookupEngineFactory", enum9);
        setField(term3426, term3426.getClass(), "value", null);
        setField(term3412, term3412.getClass(), "typeAttributeAppender", term3426);
        setField(term3412, term3412.getClass(), "defaultFieldAttributeAppenderFactory", enum10);
        setField(term3412, term3412.getClass(), "defaultMethodAttributeAppenderFactory", enum11);
        setField(term3411, term3411.getClass(), "byteBuddy", term3412);
        setLongField(term3432, term3432.getClass(), "value", 129779313676422L);
        setField(term3431, term3431.getClass(), "seed", term3432);
        setDoubleField(term3431, term3431.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3431, term3431.getClass(), "haveNextNextGaussian", false);
        setField(term3411, term3411.getClass(), "random", term3431);
        setField(term3398, term3398.getClass(), "mockBytecodeGenerator", term3411);
        setField(term3389, term3389.getClass(), "cachingMockBytecodeGenerator", term3398);
        term3436 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3436;
        callMethod(klass, "getHandler", argTypes, term3389, args);
    }

};


