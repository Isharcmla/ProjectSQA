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
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class DefaultParser_parse_16712595049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18674;
     Object term18930;
     Object term19111;
     Object term19123;
     Object term19078;

    public DefaultParser_parse_16712595049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18790 = new ArrayList();
        term18674 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term18738 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term18864 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term18674, term18674.getClass(), "options", null);
        setBooleanField(term18674, term18674.getClass(), "stopAtNonOption", false);
        setBooleanField(term18674, term18674.getClass(), "skipParsing", false);
        setField(term18674, term18674.getClass(), "currentOption", term18738);
        setField(term18674, term18674.getClass(), "expectedOpts", term18790);
        setField(term18674, term18674.getClass(), "cmd", term18864);
        ArrayList term18982 = new ArrayList();
        LinkedHashMap term19042 = new LinkedHashMap();
        term18930 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18930, term18930.getClass(), "requiredOpts", term18982);
        setField(term18930, term18930.getClass(), "optionGroups", term19042);
        LinkedList term19113 = new LinkedList();
        ArrayList term19114 = new ArrayList();
        ArrayList term19117 = new ArrayList();
        LinkedHashMap term19119 = new LinkedHashMap();
        ArrayList term19121 = new ArrayList();
        term19111 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term19112 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term19116 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19112, term19112.getClass(), "args", term19113);
        setField(term19112, term19112.getClass(), "options", term19114);
        setField(term19111, term19111.getClass(), "cmd", term19112);
        setField(term19116, term19116.getClass(), "shortOpts", null);
        setField(term19116, term19116.getClass(), "longOpts", null);
        setField(term19116, term19116.getClass(), "requiredOpts", term19117);
        setField(term19116, term19116.getClass(), "optionGroups", term19119);
        setField(term19111, term19111.getClass(), "options", term19116);
        setBooleanField(term19111, term19111.getClass(), "stopAtNonOption", false);
        setField(term19111, term19111.getClass(), "currentToken", null);
        setField(term19111, term19111.getClass(), "currentOption", null);
        setBooleanField(term19111, term19111.getClass(), "skipParsing", false);
        setField(term19111, term19111.getClass(), "expectedOpts", term19121);
        ArrayList term19124 = new ArrayList();
        LinkedHashMap term19126 = new LinkedHashMap();
        term19123 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19123, term19123.getClass(), "shortOpts", null);
        setField(term19123, term19123.getClass(), "longOpts", null);
        setField(term19123, term19123.getClass(), "requiredOpts", term19124);
        setField(term19123, term19123.getClass(), "optionGroups", term19126);
        LinkedList term19079 = new LinkedList();
        ArrayList term19082 = new ArrayList();
        term19078 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term19078, term19078.getClass(), "args", term19079);
        setField(term19078, term19078.getClass(), "options", term19082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term18930;
        args[1] = null;
        Object retValue = callMethod(klass, "parse", argTypes, term18674, args);
        assertTrue(recursiveEquals(term18674, term19111));
        assertTrue(recursiveEquals(term18930, term19123));
        assertTrue(recursiveEquals(retValue, term19078));
    }

};


