package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public class JsonTreeWriter_value_1061588875387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93111;

    public JsonTreeWriter_value_1061588875387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class term93199 =  Class.forName((String) "java.nio.DirectByteBufferR");
        Class term93235 =  Class.forName((String) "java.nio.ByteBufferAsFloatBufferL");
        Class term93271 =  Class.forName((String) "java.util.Collections$SynchronizedList");
        Class term93307 =  Class.forName((String) "java.util.zip.ZipConstants64");
        Class term93343 =  Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Sorter");
        Class term93379 =  Class.forName((String) "org.vorpal.research.kex.intrinsics.internal.BooleanGenerator");
        Class term93415 =  Class.forName((String) "java.util.concurrent.LinkedBlockingDeque$DescendingItr");
        Class term93451 =  Class.forName((String) "java.math.BitSieve");
        Class term93487 =  Class.forName((String) "java.util.Collections$EmptySet");
        Boolean term93535 = new Boolean(false);
        Object term93593 = newInstance(Class.forName("com.google.gson.JsonObject"));
        ArrayList term93163 = new ArrayList();
        ((ArrayList) term93163).add(term93199);
        ((ArrayList) term93163).add(term93235);
        ((ArrayList) term93163).add(term93235);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93307);
        ((ArrayList) term93163).add(term93343);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93379);
        ((ArrayList) term93163).add(term93343);
        ((ArrayList) term93163).add(term93415);
        ((ArrayList) term93163).add(term93451);
        ((ArrayList) term93163).add(term93379);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93487);
        ((ArrayList) term93163).add(term93535);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93271);
        ((ArrayList) term93163).add(term93593);
        term93111 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term93111, term93111.getClass(), "pendingName", null);
        setField(term93111, term93111.getClass(), "stack", term93163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        callMethod(klass, "value", argTypes, term93111, args);
    }

};


