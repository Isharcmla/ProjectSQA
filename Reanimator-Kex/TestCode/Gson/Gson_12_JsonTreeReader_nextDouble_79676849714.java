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
import java.lang.Object;

public class JsonTreeReader_nextDouble_79676849714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3475;

    public JsonTreeReader_nextDouble_79676849714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3475 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term3476 = (Object[]) newArray("java.lang.Object", 2);
        Object term3477 = newInstance(Class.forName("java.lang.Object"));
        Object term3478 = newInstance(Class.forName("java.lang.Object"));
        Object[] term3534 = (Object[]) newArray("java.lang.String", 7);
        int[] term3619 = (int[]) newIntArray(6);
        char[] term3500 = (char[]) newCharArray(3);
        int[] term3523 = (int[]) newIntArray(9);
        setElement(term3476, 0, term3477);
        setElement(term3476, 1, term3478);
        setField(term3475, term3475.getClass(), "stack", term3476);
        setIntField(term3475, term3475.getClass(), "stackSize", -358526505);
        setElement(term3534, 0, "mvrkADEgpp");
        setElement(term3534, 1, "pXOkjyeIRb");
        setElement(term3534, 2, "GgZWSjxjyE");
        setElement(term3534, 3, "EeBVbzjcCI");
        setElement(term3534, 4, "UfQtPRyWRC");
        setElement(term3534, 5, "FPvxVzzSvD");
        setElement(term3534, 6, "WHcwFgsGFC");
        setField(term3475, term3475.getClass(), "pathNames", term3534);
        setIntElement(term3619, 0, 1843268026);
        setIntElement(term3619, 1, 954660603);
        setIntElement(term3619, 2, -1351605385);
        setIntElement(term3619, 3, 278355793);
        setIntElement(term3619, 4, -310648604);
        setIntElement(term3619, 5, -648200466);
        setField(term3475, term3475.getClass(), "pathIndices", term3619);
        setField(term3475, term3475.getClass(), "in", null);
        setBooleanField(term3475, term3475.getClass(), "lenient", true);
        setCharElement(term3500, 0, 't');
        setCharElement(term3500, 1, 'D');
        setCharElement(term3500, 2, 'I');
        setField(term3475, term3475.getClass(), "buffer", term3500);
        setIntField(term3475, term3475.getClass(), "pos", -634976996);
        setIntField(term3475, term3475.getClass(), "limit", -1015274146);
        setIntField(term3475, term3475.getClass(), "lineNumber", -49052672);
        setIntField(term3475, term3475.getClass(), "lineStart", 339372704);
        setIntField(term3475, term3475.getClass(), "peeked", -851097944);
        setLongField(term3475, term3475.getClass(), "peekedLong", 2535595959091595249L);
        setIntField(term3475, term3475.getClass(), "peekedNumberLength", 803925431);
        setField(term3475, term3475.getClass(), "peekedString", "yVMkkQhvmN");
        setIntElement(term3523, 0, 76929641);
        setIntElement(term3523, 1, -2003192918);
        setIntElement(term3523, 2, -1362856620);
        setIntElement(term3523, 3, -1835839814);
        setIntElement(term3523, 4, -1404350380);
        setIntElement(term3523, 5, -2013924238);
        setIntElement(term3523, 6, 579006268);
        setIntElement(term3523, 7, -1694747156);
        setIntElement(term3523, 8, 1466373988);
        setField(term3475, term3475.getClass(), "stack", term3523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextDouble", argTypes, term3475, args);
    }

};


