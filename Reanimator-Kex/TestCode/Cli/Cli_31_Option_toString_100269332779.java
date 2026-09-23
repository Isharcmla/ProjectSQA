package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_toString_100269332779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3460;
     Object term10948;

    public Option_toString_100269332779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3513 = new ArrayList();
        term3460 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3512 = newInstance(Class.forName("java.lang.Object"));
        setField(term3460, term3460.getClass(), "opt", "mvrkADEgpp");
        setField(term3460, term3460.getClass(), "longOpt", "pXOkjyeIRb");
        setField(term3460, term3460.getClass(), "argName", "GgZWSjxjyE");
        setField(term3460, term3460.getClass(), "description", "EeBVbzjcCI");
        setBooleanField(term3460, term3460.getClass(), "required", true);
        setBooleanField(term3460, term3460.getClass(), "optionalArg", false);
        setIntField(term3460, term3460.getClass(), "numberOfArgs", 1193880199);
        setField(term3460, term3460.getClass(), "type", term3512);
        setField(term3460, term3460.getClass(), "values", term3513);
        setCharField(term3460, term3460.getClass(), "valuesep", 'l');
        ArrayList term10958 = new ArrayList();
        term10948 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10957 = newInstance(Class.forName("java.lang.Object"));
        setField(term10948, term10948.getClass(), "opt", "mvrkADEgpp");
        setField(term10948, term10948.getClass(), "longOpt", "pXOkjyeIRb");
        setField(term10948, term10948.getClass(), "argName", "GgZWSjxjyE");
        setField(term10948, term10948.getClass(), "description", "EeBVbzjcCI");
        setBooleanField(term10948, term10948.getClass(), "required", true);
        setBooleanField(term10948, term10948.getClass(), "optionalArg", false);
        setIntField(term10948, term10948.getClass(), "numberOfArgs", 1193880199);
        setField(term10948, term10948.getClass(), "type", term10957);
        setField(term10948, term10948.getClass(), "values", term10958);
        setCharField(term10948, term10948.getClass(), "valuesep", 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term3460, args);
        assertTrue(recursiveEquals(term3460, term10948));
        assertTrue(recursiveEquals(retValue, "[ option: mvrkADEgpp pXOkjyeIRb [ARG...] :: EeBVbzjcCI :: java.lang.Object@476b18f9 ]"));
    }

};


