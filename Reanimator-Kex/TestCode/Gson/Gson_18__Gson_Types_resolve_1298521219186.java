package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class _Gson_Types_resolve_1298521219186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503127;

    public _Gson_Types_resolve_1298521219186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503127 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503249 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503371 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503493 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503615 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503737 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503859 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term503981 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504103 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504225 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504347 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504469 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504591 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504713 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504835 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term504957 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505079 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505201 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505323 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505445 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505567 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505689 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505811 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term505933 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506055 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506177 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506299 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506543 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506665 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506787 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term506909 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term502660 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term506909, term506909.getClass(), "ownerType", term502660);
        setField(term506787, term506787.getClass(), "ownerType", term506909);
        setField(term506665, term506665.getClass(), "ownerType", term506787);
        setField(term506543, term506543.getClass(), "ownerType", term506665);
        setField(term506421, term506421.getClass(), "ownerType", term506543);
        setField(term506299, term506299.getClass(), "ownerType", term506421);
        setField(term506177, term506177.getClass(), "ownerType", term506299);
        setField(term506055, term506055.getClass(), "ownerType", term506177);
        setField(term505933, term505933.getClass(), "ownerType", term506055);
        setField(term505811, term505811.getClass(), "ownerType", term505933);
        setField(term505689, term505689.getClass(), "ownerType", term505811);
        setField(term505567, term505567.getClass(), "ownerType", term505689);
        setField(term505445, term505445.getClass(), "ownerType", term505567);
        setField(term505323, term505323.getClass(), "ownerType", term505445);
        setField(term505201, term505201.getClass(), "ownerType", term505323);
        setField(term505079, term505079.getClass(), "ownerType", term505201);
        setField(term504957, term504957.getClass(), "ownerType", term505079);
        setField(term504835, term504835.getClass(), "ownerType", term504957);
        setField(term504713, term504713.getClass(), "ownerType", term504835);
        setField(term504591, term504591.getClass(), "ownerType", term504713);
        setField(term504469, term504469.getClass(), "ownerType", term504591);
        setField(term504347, term504347.getClass(), "ownerType", term504469);
        setField(term504225, term504225.getClass(), "ownerType", term504347);
        setField(term504103, term504103.getClass(), "ownerType", term504225);
        setField(term503981, term503981.getClass(), "ownerType", term504103);
        setField(term503859, term503859.getClass(), "ownerType", term503981);
        setField(term503737, term503737.getClass(), "ownerType", term503859);
        setField(term503615, term503615.getClass(), "ownerType", term503737);
        setField(term503493, term503493.getClass(), "ownerType", term503615);
        setField(term503371, term503371.getClass(), "ownerType", term503493);
        setField(term503249, term503249.getClass(), "ownerType", term503371);
        setField(term503127, term503127.getClass(), "ownerType", term503249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term503127;
        try {
            callMethod(klass, "resolve", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


