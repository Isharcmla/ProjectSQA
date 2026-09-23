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
import java.util.ArrayList;

public class Option_toString_100269332779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3427;
     Object term10788;

    public Option_toString_100269332779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3479 = new ArrayList();
        term3427 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3427, term3427.getClass(), "opt", "mvrkADEgpp");
        setField(term3427, term3427.getClass(), "longOpt", "pXOkjyeIRb");
        setField(term3427, term3427.getClass(), "argName", "GgZWSjxjyE");
        setField(term3427, term3427.getClass(), "description", "EeBVbzjcCI");
        setBooleanField(term3427, term3427.getClass(), "required", true);
        setBooleanField(term3427, term3427.getClass(), "optionalArg", false);
        setIntField(term3427, term3427.getClass(), "numberOfArgs", 1193880199);
        setField(term3427, term3427.getClass(), "type", null);
        setField(term3427, term3427.getClass(), "values", term3479);
        setCharField(term3427, term3427.getClass(), "valuesep", 'l');
        ArrayList term10797 = new ArrayList();
        term10788 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10788, term10788.getClass(), "opt", "mvrkADEgpp");
        setField(term10788, term10788.getClass(), "longOpt", "pXOkjyeIRb");
        setField(term10788, term10788.getClass(), "argName", "GgZWSjxjyE");
        setField(term10788, term10788.getClass(), "description", "EeBVbzjcCI");
        setBooleanField(term10788, term10788.getClass(), "required", true);
        setBooleanField(term10788, term10788.getClass(), "optionalArg", false);
        setIntField(term10788, term10788.getClass(), "numberOfArgs", 1193880199);
        setField(term10788, term10788.getClass(), "type", null);
        setField(term10788, term10788.getClass(), "values", term10797);
        setCharField(term10788, term10788.getClass(), "valuesep", 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term3427, args);
        assertTrue(recursiveEquals(term3427, term10788));
        assertTrue(recursiveEquals(retValue, "[ option: mvrkADEgpp pXOkjyeIRb [ARG...] :: EeBVbzjcCI ]"));
    }

};


