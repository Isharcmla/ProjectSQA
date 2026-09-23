package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_getAllSymbols_211168287021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;
     Object term2793;
     Object term2703;

    public ReferenceCollectingCallback_getAllSymbols_211168287021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term184 = new HashMap();
        Object term200 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term200, term200.getClass(), "parent", null);
        setBooleanField(term200, term200.getClass(), "isHoisted", false);
        setBooleanField(term200, term200.getClass(), "isFunction", false);
        setBooleanField(term200, term200.getClass(), "isLoop", false);
        Object term204 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term204, term204.getClass(), "parent", null);
        setBooleanField(term204, term204.getClass(), "isHoisted", false);
        setBooleanField(term204, term204.getClass(), "isFunction", false);
        setBooleanField(term204, term204.getClass(), "isLoop", false);
        Object term208 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term208, term208.getClass(), "parent", null);
        setBooleanField(term208, term208.getClass(), "isHoisted", false);
        setBooleanField(term208, term208.getClass(), "isFunction", false);
        setBooleanField(term208, term208.getClass(), "isLoop", false);
        ArrayDeque term198 = new ArrayDeque();
        ((ArrayDeque) term198).add(term200);
        ((ArrayDeque) term198).add(term204);
        ((ArrayDeque) term198).add(term208);
        term183 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term183, term183.getClass(), "referenceMap", term184);
        setField(term183, term183.getClass(), "blockStack", term198);
        setField(term183, term183.getClass(), "behavior", null);
        setField(term183, term183.getClass(), "compiler", null);
        setField(term183, term183.getClass(), "varFilter", null);
        HashMap term2794 = new HashMap();
        Object term2798 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2798, term2798.getClass(), "parent", null);
        setBooleanField(term2798, term2798.getClass(), "isHoisted", false);
        setBooleanField(term2798, term2798.getClass(), "isFunction", false);
        setBooleanField(term2798, term2798.getClass(), "isLoop", false);
        Object term2799 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2799, term2799.getClass(), "parent", null);
        setBooleanField(term2799, term2799.getClass(), "isHoisted", false);
        setBooleanField(term2799, term2799.getClass(), "isFunction", false);
        setBooleanField(term2799, term2799.getClass(), "isLoop", false);
        Object term2800 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term2800, term2800.getClass(), "parent", null);
        setBooleanField(term2800, term2800.getClass(), "isHoisted", false);
        setBooleanField(term2800, term2800.getClass(), "isFunction", false);
        setBooleanField(term2800, term2800.getClass(), "isLoop", false);
        ArrayDeque term2796 = new ArrayDeque();
        ((ArrayDeque) term2796).add(term2798);
        ((ArrayDeque) term2796).add(term2799);
        ((ArrayDeque) term2796).add(term2800);
        term2793 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term2793, term2793.getClass(), "referenceMap", term2794);
        setField(term2793, term2793.getClass(), "blockStack", term2796);
        setField(term2793, term2793.getClass(), "behavior", null);
        setField(term2793, term2793.getClass(), "compiler", null);
        setField(term2793, term2793.getClass(), "varFilter", null);
        HashMap term2704 = new HashMap();
        term2703 = newInstance(Class.forName("java.util.HashMap$KeySet"));
        setField(term2703, term2703.getClass(), "this$0", term2704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllSymbols", argTypes, term183, args);
        assertTrue(recursiveEquals(term183, term2793));
        assertTrue(recursiveEquals(retValue, term2703));
    }

};


