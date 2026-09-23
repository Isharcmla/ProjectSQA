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
import java.lang.Object;

public class JsonTreeWriter_close_160520178216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2241;

    public JsonTreeWriter_close_160520178216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2242 = new ArrayList();
        term2241 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term2258 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term2259 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term2260 = (int[]) newIntArray(32);
        setField(term2241, term2241.getClass(), "stack", term2242);
        setField(term2241, term2241.getClass(), "pendingName", "LvtrsXUliU");
        setField(term2241, term2241.getClass(), "product", term2258);
        setField(term2259, term2259.getClass(), "writeBuffer", null);
        setField(term2259, term2259.getClass(), "lock", term2259);
        setField(term2241, term2241.getClass(), "out", term2259);
        setIntElement(term2260, 0, 6);
        setField(term2241, term2241.getClass(), "stack", term2260);
        setIntField(term2241, term2241.getClass(), "stackSize", 1);
        setField(term2241, term2241.getClass(), "indent", "xLbjWUgOIL");
        setField(term2241, term2241.getClass(), "separator", ":");
        setBooleanField(term2241, term2241.getClass(), "lenient", true);
        setBooleanField(term2241, term2241.getClass(), "htmlSafe", true);
        setField(term2241, term2241.getClass(), "deferredName", "jDtqGUpnZN");
        setBooleanField(term2241, term2241.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term2241, args);
    }

};


