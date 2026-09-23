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

public class Option_getOpt_118953974449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;
     Object term5379;

    public Option_getOpt_118953974449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term408 = new ArrayList();
        term355 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term407 = newInstance(Class.forName("java.lang.Object"));
        setField(term355, term355.getClass(), "opt", "aJlieCFVtF");
        setField(term355, term355.getClass(), "longOpt", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "argName", "tbcdzjIfER");
        setField(term355, term355.getClass(), "description", "HyxfbSQYBe");
        setBooleanField(term355, term355.getClass(), "required", true);
        setBooleanField(term355, term355.getClass(), "optionalArg", true);
        setIntField(term355, term355.getClass(), "numberOfArgs", 1484323161);
        setField(term355, term355.getClass(), "type", term407);
        setField(term355, term355.getClass(), "values", term408);
        setCharField(term355, term355.getClass(), "valuesep", 'E');
        ArrayList term5389 = new ArrayList();
        term5379 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term5388 = newInstance(Class.forName("java.lang.Object"));
        setField(term5379, term5379.getClass(), "opt", "aJlieCFVtF");
        setField(term5379, term5379.getClass(), "longOpt", "ZiaGIbnzTs");
        setField(term5379, term5379.getClass(), "argName", "tbcdzjIfER");
        setField(term5379, term5379.getClass(), "description", "HyxfbSQYBe");
        setBooleanField(term5379, term5379.getClass(), "required", true);
        setBooleanField(term5379, term5379.getClass(), "optionalArg", true);
        setIntField(term5379, term5379.getClass(), "numberOfArgs", 1484323161);
        setField(term5379, term5379.getClass(), "type", term5388);
        setField(term5379, term5379.getClass(), "values", term5389);
        setCharField(term5379, term5379.getClass(), "valuesep", 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOpt", argTypes, term355, args);
        assertTrue(recursiveEquals(term355, term5379));
        assertTrue(recursiveEquals(retValue, "aJlieCFVtF"));
    }

};


