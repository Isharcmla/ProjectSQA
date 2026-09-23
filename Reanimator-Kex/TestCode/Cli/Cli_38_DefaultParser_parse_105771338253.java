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

public class DefaultParser_parse_105771338253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20786;
     Object term20852;
     Object term20464;
     Object term21165;
     Object term21184;
     Object term21189;
     Object term21096;

    public DefaultParser_parse_105771338253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20786 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term20786, term20786.getClass(), "options", null);
        setBooleanField(term20786, term20786.getClass(), "stopAtNonOption", false);
        setBooleanField(term20786, term20786.getClass(), "skipParsing", false);
        setField(term20786, term20786.getClass(), "currentOption", null);
        setField(term20786, term20786.getClass(), "expectedOpts", null);
        setField(term20786, term20786.getClass(), "cmd", null);
        setField(term20786, term20786.getClass(), "currentToken", null);
        ArrayList term20904 = new ArrayList();
        LinkedHashMap term20964 = new LinkedHashMap();
        term20852 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term20852, term20852.getClass(), "requiredOpts", term20904);
        setField(term20852, term20852.getClass(), "optionGroups", term20964);
        term20464 = (Object[]) newArray("java.lang.String", 2);
        setElement(term20464, 0, "");
        setElement(term20464, 1, "");
        LinkedList term21167 = new LinkedList();
        ((LinkedList) term21167).add("");
        ((LinkedList) term21167).add("");
        ArrayList term21173 = new ArrayList();
        ArrayList term21176 = new ArrayList();
        LinkedHashMap term21178 = new LinkedHashMap();
        ArrayList term21182 = new ArrayList();
        term21165 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term21166 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term21175 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term21166, term21166.getClass(), "args", term21167);
        setField(term21166, term21166.getClass(), "options", term21173);
        setField(term21165, term21165.getClass(), "cmd", term21166);
        setField(term21175, term21175.getClass(), "shortOpts", null);
        setField(term21175, term21175.getClass(), "longOpts", null);
        setField(term21175, term21175.getClass(), "requiredOpts", term21176);
        setField(term21175, term21175.getClass(), "optionGroups", term21178);
        setField(term21165, term21165.getClass(), "options", term21175);
        setBooleanField(term21165, term21165.getClass(), "stopAtNonOption", false);
        setField(term21165, term21165.getClass(), "currentToken", "");
        setField(term21165, term21165.getClass(), "currentOption", null);
        setBooleanField(term21165, term21165.getClass(), "skipParsing", false);
        setField(term21165, term21165.getClass(), "expectedOpts", term21182);
        ArrayList term21185 = new ArrayList();
        LinkedHashMap term21187 = new LinkedHashMap();
        term21184 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term21184, term21184.getClass(), "shortOpts", null);
        setField(term21184, term21184.getClass(), "longOpts", null);
        setField(term21184, term21184.getClass(), "requiredOpts", term21185);
        setField(term21184, term21184.getClass(), "optionGroups", term21187);
        term21189 = (Object[]) newArray("java.lang.String", 2);
        setElement(term21189, 0, "");
        setElement(term21189, 1, "");
        LinkedList term21097 = new LinkedList();
        ((LinkedList) term21097).add("");
        ((LinkedList) term21097).add("");
        ArrayList term21105 = new ArrayList();
        term21096 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term21096, term21096.getClass(), "args", term21097);
        setField(term21096, term21096.getClass(), "options", term21105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term20852;
        args[1] = term20464;
        args[2] = false;
        Object retValue = callMethod(klass, "parse", argTypes, term20786, args);
        assertTrue(recursiveEquals(term20786, term21165));
        assertTrue(recursiveEquals(term20852, term21184));
        assertTrue(recursiveEquals(term20464, term21189));
        assertTrue(recursiveEquals(retValue, term21096));
    }

};


