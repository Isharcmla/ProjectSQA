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

public class DefaultParser_parse_1057713382118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381141;
     Object term381273;
     Object term381446;
     Object term381458;
     Object term381421;

    public DefaultParser_parse_1057713382118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381141 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term381207 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term381141, term381141.getClass(), "options", term381207);
        setBooleanField(term381141, term381141.getClass(), "stopAtNonOption", false);
        setBooleanField(term381141, term381141.getClass(), "skipParsing", false);
        setField(term381141, term381141.getClass(), "currentOption", null);
        setField(term381141, term381141.getClass(), "expectedOpts", null);
        setField(term381141, term381141.getClass(), "cmd", null);
        ArrayList term381325 = new ArrayList();
        LinkedHashMap term381385 = new LinkedHashMap();
        term381273 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term381273, term381273.getClass(), "requiredOpts", term381325);
        setField(term381273, term381273.getClass(), "optionGroups", term381385);
        LinkedList term381448 = new LinkedList();
        ArrayList term381449 = new ArrayList();
        ArrayList term381452 = new ArrayList();
        LinkedHashMap term381454 = new LinkedHashMap();
        ArrayList term381456 = new ArrayList();
        term381446 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term381447 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term381451 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term381447, term381447.getClass(), "args", term381448);
        setField(term381447, term381447.getClass(), "options", term381449);
        setField(term381446, term381446.getClass(), "cmd", term381447);
        setField(term381451, term381451.getClass(), "shortOpts", null);
        setField(term381451, term381451.getClass(), "longOpts", null);
        setField(term381451, term381451.getClass(), "requiredOpts", term381452);
        setField(term381451, term381451.getClass(), "optionGroups", term381454);
        setField(term381446, term381446.getClass(), "options", term381451);
        setBooleanField(term381446, term381446.getClass(), "stopAtNonOption", true);
        setField(term381446, term381446.getClass(), "currentToken", null);
        setField(term381446, term381446.getClass(), "currentOption", null);
        setBooleanField(term381446, term381446.getClass(), "skipParsing", false);
        setField(term381446, term381446.getClass(), "expectedOpts", term381456);
        ArrayList term381459 = new ArrayList();
        LinkedHashMap term381461 = new LinkedHashMap();
        term381458 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term381458, term381458.getClass(), "shortOpts", null);
        setField(term381458, term381458.getClass(), "longOpts", null);
        setField(term381458, term381458.getClass(), "requiredOpts", term381459);
        setField(term381458, term381458.getClass(), "optionGroups", term381461);
        LinkedList term381422 = new LinkedList();
        ArrayList term381425 = new ArrayList();
        term381421 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term381421, term381421.getClass(), "args", term381422);
        setField(term381421, term381421.getClass(), "options", term381425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term381273;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "parse", argTypes, term381141, args);
        assertTrue(recursiveEquals(term381141, term381446));
        assertTrue(recursiveEquals(term381273, term381458));
        assertTrue(recursiveEquals(retValue, term381421));
    }

};


