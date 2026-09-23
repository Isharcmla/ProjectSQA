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

public class ByteBuddyMockMaker_ensureMockIsAssignableToMockedType_141171187011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1768;
     Object term1815;

    public ByteBuddyMockMaker_ensureMockIsAssignableToMockedType_141171187011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8734 = Class.forName((String) "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory");
        Field term8733 = ((Class) term8734).getDeclaredField((String) "FAIL_ON_REQUEST");
        ((Field) term8733).setAccessible(true);
        Object enum20 = ((Field) term8733).get((Object) null);
        Class<? extends Object> term9116 = Class.forName((String) "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory");
        Field term9115 = ((Class) term9116).getDeclaredField((String) "INSTANCE");
        ((Field) term9115).setAccessible(true);
        Object enum21 = ((Field) term9115).get((Object) null);
        Class<? extends Object> term9502 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp");
        Field term9501 = ((Class) term9502).getDeclaredField((String) "INSTANCE");
        ((Field) term9501).setAccessible(true);
        Object enum22 = ((Field) term9501).get((Object) null);
        Class<? extends Object> term9868 = Class.forName((String) "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod");
        Field term9867 = ((Class) term9868).getDeclaredField((String) "INSTANCE");
        ((Field) term9867).setAccessible(true);
        Object enum23 = ((Field) term9867).get((Object) null);
        term1768 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"));
        Object term1769 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis"));
        Object term1770 = newInstance(Class.forName("org.objenesis.ObjenesisStd"));
        Object term1771 = newInstance(Class.forName("org.objenesis.strategy.StdInstantiatorStrategy"));
        Object term1772 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term1777 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator"));
        Object term1778 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock"));
        Object term1779 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantLock$NonfairSync"));
        Object term1781 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term1782 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term1786 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1787 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1790 = newInstance(Class.forName("org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator"));
        Object term1791 = newInstance(Class.forName("net.bytebuddy.ByteBuddy"));
        Object term1792 = newInstance(Class.forName("net.bytebuddy.ClassFileVersion"));
        Object term1794 = newInstance(Class.forName("net.bytebuddy.NamingStrategy$SuffixingRandom"));
        Object term1795 = newInstance(Class.forName("net.bytebuddy.instrumentation.type.TypeList$Empty"));
        Object term1797 = newInstance(Class.forName("net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction"));
        Object term1800 = newInstance(Class.forName("net.bytebuddy.asm.ClassVisitorWrapper$Chain"));
        Object term1801 = newInstance(Class.forName("net.bytebuddy.dynamic.scaffold.MethodRegistry$Default"));
        Object term1802 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Undefined"));
        Object term1805 = newInstance(Class.forName("net.bytebuddy.ByteBuddy$Definable$Defined"));
        Object term1810 = newInstance(Class.forName("java.util.Random"));
        Object term1811 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term1770, term1770.getClass(), "strategy", term1771);
        setField(term1772, term1772.getClass(), "table", null);
        setField(term1772, term1772.getClass(), "nextTable", null);
        setLongField(term1772, term1772.getClass(), "baseCount", 0L);
        setIntField(term1772, term1772.getClass(), "sizeCtl", 0);
        setIntField(term1772, term1772.getClass(), "transferIndex", 0);
        setIntField(term1772, term1772.getClass(), "cellsBusy", 0);
        setField(term1772, term1772.getClass(), "counterCells", null);
        setField(term1772, term1772.getClass(), "keySet", null);
        setField(term1772, term1772.getClass(), "values", null);
        setField(term1772, term1772.getClass(), "entrySet", null);
        setField(term1772, term1772.getClass(), "keySet", null);
        setField(term1772, term1772.getClass(), "values", null);
        setField(term1770, term1770.getClass(), "cache", term1772);
        setField(term1769, term1769.getClass(), "objenesis", term1770);
        setField(term1768, term1768.getClass(), "classInstantiator", term1769);
        setField(term1779, term1779.getClass(), "head", null);
        setField(term1779, term1779.getClass(), "tail", null);
        setIntField(term1779, term1779.getClass(), "state", 0);
        setField(term1779, term1779.getClass(), "exclusiveOwnerThread", null);
        setField(term1778, term1778.getClass(), "sync", term1779);
        setField(term1777, term1777.getClass(), "avoidingClassLeakCacheLock", term1778);
        setField(term1781, term1781.getClass(), "table", term1782);
        setIntField(term1781, term1781.getClass(), "size", 0);
        setIntField(term1781, term1781.getClass(), "threshold", 12);
        setFloatField(term1781, term1781.getClass(), "loadFactor", 0.75F);
        setField(term1786, term1786.getClass(), "lock", term1787);
        setField(term1786, term1786.getClass(), "head", null);
        setLongField(term1786, term1786.getClass(), "queueLength", 0L);
        setField(term1781, term1781.getClass(), "queue", term1786);
        setIntField(term1781, term1781.getClass(), "modCount", 0);
        setField(term1781, term1781.getClass(), "entrySet", null);
        setField(term1781, term1781.getClass(), "keySet", null);
        setField(term1781, term1781.getClass(), "values", null);
        setField(term1777, term1777.getClass(), "avoidingClassLeakageCache", term1781);
        setIntField(term1792, term1792.getClass(), "versionNumber", 49);
        setField(term1791, term1791.getClass(), "classFileVersion", term1792);
        setField(term1794, term1794.getClass(), "suffix", null);
        setField(term1794, term1794.getClass(), "javaLangPackagePrefix", null);
        setField(term1794, term1794.getClass(), "random", null);
        setField(term1791, term1791.getClass(), "namingStrategy", term1794);
        setIntField(term1795, term1795.getClass(), "modCount", 0);
        setField(term1791, term1791.getClass(), "interfaceTypes", term1795);
        setField(term1797, term1797.getClass(), "left", null);
        setField(term1797, term1797.getClass(), "right", null);
        setField(term1791, term1791.getClass(), "ignoredMethods", term1797);
        setField(term1791, term1791.getClass(), "bridgeMethodResolverFactory", enum20);
        setField(term1800, term1800.getClass(), "classVisitorWrappers", null);
        setField(term1791, term1791.getClass(), "classVisitorWrapperChain", term1800);
        setField(term1801, term1801.getClass(), "entries", null);
        setField(term1791, term1791.getClass(), "methodRegistry", term1801);
        setField(term1791, term1791.getClass(), "modifiers", term1802);
        setField(term1791, term1791.getClass(), "methodLookupEngineFactory", enum21);
        setField(term1805, term1805.getClass(), "value", null);
        setField(term1791, term1791.getClass(), "typeAttributeAppender", term1805);
        setField(term1791, term1791.getClass(), "defaultFieldAttributeAppenderFactory", enum22);
        setField(term1791, term1791.getClass(), "defaultMethodAttributeAppenderFactory", enum23);
        setField(term1790, term1790.getClass(), "byteBuddy", term1791);
        setLongField(term1811, term1811.getClass(), "value", 111144881702083L);
        setField(term1810, term1810.getClass(), "seed", term1811);
        setDoubleField(term1810, term1810.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term1810, term1810.getClass(), "haveNextNextGaussian", false);
        setField(term1790, term1790.getClass(), "random", term1810);
        setField(term1777, term1777.getClass(), "mockBytecodeGenerator", term1790);
        setField(term1768, term1768.getClass(), "cachingMockBytecodeGenerator", term1777);
        term1815 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.mock.MockCreationSettings");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1815;
        try {
            callMethod(klass, "ensureMockIsAssignableToMockedType", argTypes, term1768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


