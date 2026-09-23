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
import java.lang.Object;

public class Option_getValues_104491653269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47986;
     Object term48105;
     Object term48098;

    public Option_getValues_104491653269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48038 = new ArrayList();
        ((ArrayList) term48038).add("byte");
        term47986 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term47986, term47986.getClass(), "values", term48038);
        ArrayList term48106 = new ArrayList();
        ((ArrayList) term48106).add("byte");
        term48105 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term48105, term48105.getClass(), "opt", null);
        setField(term48105, term48105.getClass(), "longOpt", null);
        setField(term48105, term48105.getClass(), "argName", null);
        setField(term48105, term48105.getClass(), "description", null);
        setBooleanField(term48105, term48105.getClass(), "required", false);
        setBooleanField(term48105, term48105.getClass(), "optionalArg", false);
        setIntField(term48105, term48105.getClass(), "numberOfArgs", 0);
        setField(term48105, term48105.getClass(), "type", null);
        setField(term48105, term48105.getClass(), "values", term48106);
        setCharField(term48105, term48105.getClass(), "valuesep", (char) 0);
        term48098 = (Object[]) newArray("java.lang.String", 1);
        setElement(term48098, 0, "byte");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValues", argTypes, term47986, args);
        assertTrue(recursiveEquals(term47986, term48105));
        assertTrue(recursiveEquals(retValue, term48098));
    }

};


