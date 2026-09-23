package org.apache.commons.collections4;

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
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.EqualityUtils.*;

public class IteratorUtils_apply_1953012169509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94291;
     Object term94407;
     Object term94658;
     Object term94659;

    public IteratorUtils_apply_1953012169509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94291 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        term94407 = newInstance(Class.forName("org.apache.commons.collections4.functors.ChainedClosure"));
        term94658 = newInstance(Class.forName("java.util.concurrent.LinkedBlockingQueue$Itr"));
        setField(term94658, term94658.getClass(), "next", null);
        setField(term94658, term94658.getClass(), "nextItem", null);
        setField(term94658, term94658.getClass(), "lastRet", null);
        setField(term94658, term94658.getClass(), "ancestor", null);
        setField(term94658, term94658.getClass(), "this$0", null);
        term94659 = newInstance(Class.forName("org.apache.commons.collections4.functors.ChainedClosure"));
        setField(term94659, term94659.getClass(), "iClosures", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Closure");
        Object[] args = new Object[2];
        args[0] = term94291;
        args[1] = term94407;
        callMethod(klass, "apply", argTypes, null, args);
        assertTrue(recursiveEquals(term94291, term94658));
        assertTrue(recursiveEquals(term94407, term94659));
    }

};


