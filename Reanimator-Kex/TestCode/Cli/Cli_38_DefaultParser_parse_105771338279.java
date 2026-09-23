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
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.LinkedList;

public class DefaultParser_parse_105771338279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337708;
     Object term337774;
     Object term336811;
     Object term355377;
     Object term355400;
     Object term355405;
     Object term353707;

    public DefaultParser_parse_105771338279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337708 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term337708, term337708.getClass(), "options", null);
        setBooleanField(term337708, term337708.getClass(), "stopAtNonOption", false);
        setBooleanField(term337708, term337708.getClass(), "skipParsing", false);
        setField(term337708, term337708.getClass(), "currentOption", null);
        setField(term337708, term337708.getClass(), "expectedOpts", null);
        setField(term337708, term337708.getClass(), "cmd", null);
        setField(term337708, term337708.getClass(), "currentToken", null);
        ArrayList term337826 = new ArrayList();
        LinkedHashMap term337886 = new LinkedHashMap();
        term337774 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term337774, term337774.getClass(), "requiredOpts", term337826);
        setField(term337774, term337774.getClass(), "optionGroups", term337886);
        term336811 = (Object[]) newArray("java.lang.String", 4);
        setElement(term336811, 0, "                                                                                                                                ");
        setElement(term336811, 1, "");
        setElement(term336811, 2, "");
        setElement(term336811, 3, "                                                                                                                                ");
        LinkedList term355379 = new LinkedList();
        ((LinkedList) term355379).add("                                                                                                                                ");
        ((LinkedList) term355379).add("");
        ((LinkedList) term355379).add((Object)null);
        ((LinkedList) term355379).add((Object)null);
        ArrayList term355389 = new ArrayList();
        ArrayList term355392 = new ArrayList();
        LinkedHashMap term355394 = new LinkedHashMap();
        ArrayList term355398 = new ArrayList();
        term355377 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term355378 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term355391 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355378, term355378.getClass(), "args", term355379);
        setField(term355378, term355378.getClass(), "options", term355389);
        setField(term355377, term355377.getClass(), "cmd", term355378);
        setField(term355391, term355391.getClass(), "shortOpts", null);
        setField(term355391, term355391.getClass(), "longOpts", null);
        setField(term355391, term355391.getClass(), "requiredOpts", term355392);
        setField(term355391, term355391.getClass(), "optionGroups", term355394);
        setField(term355377, term355377.getClass(), "options", term355391);
        setBooleanField(term355377, term355377.getClass(), "stopAtNonOption", false);
        setField(term355377, term355377.getClass(), "currentToken", "                                                                                                                                ");
        setField(term355377, term355377.getClass(), "currentOption", null);
        setBooleanField(term355377, term355377.getClass(), "skipParsing", false);
        setField(term355377, term355377.getClass(), "expectedOpts", term355398);
        ArrayList term355401 = new ArrayList();
        LinkedHashMap term355403 = new LinkedHashMap();
        term355400 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355400, term355400.getClass(), "shortOpts", null);
        setField(term355400, term355400.getClass(), "longOpts", null);
        setField(term355400, term355400.getClass(), "requiredOpts", term355401);
        setField(term355400, term355400.getClass(), "optionGroups", term355403);
        term355405 = (Object[]) newArray("java.lang.String", 4);
        setElement(term355405, 0, "                                                                                                                                ");
        setElement(term355405, 1, "");
        setElement(term355405, 2, "");
        setElement(term355405, 3, "                                                                                                                                ");
        LinkedList term353708 = new LinkedList();
        ((LinkedList) term353708).add("                                                                                                                                ");
        ((LinkedList) term353708).add("");
        ((LinkedList) term353708).add((Object)null);
        ((LinkedList) term353708).add((Object)null);
        ArrayList term353976 = new ArrayList();
        term353707 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term353707, term353707.getClass(), "args", term353708);
        setField(term353707, term353707.getClass(), "options", term353976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term337774;
        args[1] = term336811;
        args[2] = false;
        Object retValue = callMethod(klass, "parse", argTypes, term337708, args);
        assertTrue(recursiveEquals(term337708, term355377));
        assertTrue(recursiveEquals(term337774, term355400));
        assertTrue(recursiveEquals(term336811, term355405));
        assertTrue(recursiveEquals(retValue, term353707));
    }

};


