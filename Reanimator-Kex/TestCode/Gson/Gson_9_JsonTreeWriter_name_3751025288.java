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

public class JsonTreeWriter_name_3751025288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;

    public JsonTreeWriter_name_3751025288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1024 = new ArrayList();
        term1023 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term1040 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term1041 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term1042 = (int[]) newIntArray(32);
        setField(term1023, term1023.getClass(), "stack", term1024);
        setField(term1023, term1023.getClass(), "pendingName", "RkybSrpybU");
        setField(term1023, term1023.getClass(), "product", term1040);
        setField(term1041, term1041.getClass(), "writeBuffer", null);
        setField(term1041, term1041.getClass(), "lock", term1041);
        setField(term1023, term1023.getClass(), "out", term1041);
        setIntElement(term1042, 0, 6);
        setField(term1023, term1023.getClass(), "stack", term1042);
        setIntField(term1023, term1023.getClass(), "stackSize", 1);
        setField(term1023, term1023.getClass(), "indent", "xOEqzGAmDU");
        setField(term1023, term1023.getClass(), "separator", ":");
        setBooleanField(term1023, term1023.getClass(), "lenient", false);
        setBooleanField(term1023, term1023.getClass(), "htmlSafe", false);
        setField(term1023, term1023.getClass(), "deferredName", "eZFUvlxvGV");
        setBooleanField(term1023, term1023.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "name", argTypes, term1023, args);
    }

};


