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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_handleOption_129848403545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4076;
     Object term4185;
     Object term14154;
     Object term14170;

    public DefaultParser_handleOption_129848403545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4078 = new LinkedList();
        ArrayList term4081 = new ArrayList();
        LinkedHashMap term4086 = new LinkedHashMap();
        LinkedHashMap term4092 = new LinkedHashMap();
        ArrayList term4098 = new ArrayList();
        LinkedHashMap term4102 = new LinkedHashMap();
        ArrayList term4173 = new ArrayList();
        ((ArrayList) term4173).add("");
        ((ArrayList) term4173).add("");
        ArrayList term4181 = new ArrayList();
        term4076 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4077 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4085 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4121 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4077, term4077.getClass(), "args", term4078);
        setField(term4077, term4077.getClass(), "options", term4081);
        setField(term4076, term4076.getClass(), "cmd", term4077);
        setField(term4085, term4085.getClass(), "shortOpts", term4086);
        setField(term4085, term4085.getClass(), "longOpts", term4092);
        setField(term4085, term4085.getClass(), "requiredOpts", term4098);
        setField(term4085, term4085.getClass(), "optionGroups", term4102);
        setField(term4076, term4076.getClass(), "options", term4085);
        setBooleanField(term4076, term4076.getClass(), "stopAtNonOption", true);
        setField(term4076, term4076.getClass(), "currentToken", "kVEZMHmRtR");
        setField(term4121, term4121.getClass(), "opt", "ekxGuOYIwi");
        setField(term4121, term4121.getClass(), "longOpt", "RbVQXSpxXy");
        setField(term4121, term4121.getClass(), "argName", "YpJbIgJWWv");
        setField(term4121, term4121.getClass(), "description", "JppkknKVOw");
        setBooleanField(term4121, term4121.getClass(), "required", false);
        setBooleanField(term4121, term4121.getClass(), "optionalArg", true);
        setIntField(term4121, term4121.getClass(), "numberOfArgs", -655067527);
        setField(term4121, term4121.getClass(), "type", null);
        setField(term4121, term4121.getClass(), "values", term4173);
        setCharField(term4121, term4121.getClass(), "valuesep", 'M');
        setField(term4076, term4076.getClass(), "currentOption", term4121);
        setBooleanField(term4076, term4076.getClass(), "skipParsing", false);
        setField(term4076, term4076.getClass(), "expectedOpts", term4181);
        ArrayList term4237 = new ArrayList();
        ((ArrayList) term4237).add("tRxZafjqIx");
        ((ArrayList) term4237).add("DhjNLmRMCu");
        ((ArrayList) term4237).add("PgPzMSEjjX");
        ((ArrayList) term4237).add("wzsPSPcRdj");
        ((ArrayList) term4237).add("kGMQdqJYyB");
        ((ArrayList) term4237).add("XJJNClzHRf");
        term4185 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4185, term4185.getClass(), "opt", "vKQukfbJUd");
        setField(term4185, term4185.getClass(), "longOpt", "lFRJFUMVbx");
        setField(term4185, term4185.getClass(), "argName", "sZdUNdggUW");
        setField(term4185, term4185.getClass(), "description", "OqbwYQfvAe");
        setBooleanField(term4185, term4185.getClass(), "required", true);
        setBooleanField(term4185, term4185.getClass(), "optionalArg", false);
        setIntField(term4185, term4185.getClass(), "numberOfArgs", -6029667);
        setField(term4185, term4185.getClass(), "type", null);
        setField(term4185, term4185.getClass(), "values", term4237);
        setCharField(term4185, term4185.getClass(), "valuesep", 'u');
        LinkedList term14156 = new LinkedList();
        Object term14159 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14159, term14159.getClass(), "opt", null);
        setField(term14159, term14159.getClass(), "longOpt", null);
        setField(term14159, term14159.getClass(), "argName", null);
        setField(term14159, term14159.getClass(), "description", null);
        setBooleanField(term14159, term14159.getClass(), "required", true);
        setBooleanField(term14159, term14159.getClass(), "optionalArg", false);
        setIntField(term14159, term14159.getClass(), "numberOfArgs", -6029667);
        setField(term14159, term14159.getClass(), "type", null);
        setField(term14159, term14159.getClass(), "values", null);
        setCharField(term14159, term14159.getClass(), "valuesep", 'u');
        ArrayList term14157 = new ArrayList();
        ((ArrayList) term14157).add(term14159);
        LinkedHashMap term14161 = new LinkedHashMap();
        LinkedHashMap term14162 = new LinkedHashMap();
        ArrayList term14163 = new ArrayList();
        LinkedHashMap term14165 = new LinkedHashMap();
        ArrayList term14168 = new ArrayList();
        term14154 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term14155 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term14160 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term14155, term14155.getClass(), "args", term14156);
        setField(term14155, term14155.getClass(), "options", term14157);
        setField(term14154, term14154.getClass(), "cmd", term14155);
        setField(term14160, term14160.getClass(), "shortOpts", term14161);
        setField(term14160, term14160.getClass(), "longOpts", term14162);
        setField(term14160, term14160.getClass(), "requiredOpts", term14163);
        setField(term14160, term14160.getClass(), "optionGroups", term14165);
        setField(term14154, term14154.getClass(), "options", term14160);
        setBooleanField(term14154, term14154.getClass(), "stopAtNonOption", true);
        setField(term14154, term14154.getClass(), "currentToken", "kVEZMHmRtR");
        setField(term14154, term14154.getClass(), "currentOption", null);
        setBooleanField(term14154, term14154.getClass(), "skipParsing", false);
        setField(term14154, term14154.getClass(), "expectedOpts", term14168);
        ArrayList term14179 = new ArrayList();
        ((ArrayList) term14179).add("tRxZafjqIx");
        ((ArrayList) term14179).add("DhjNLmRMCu");
        ((ArrayList) term14179).add("PgPzMSEjjX");
        ((ArrayList) term14179).add("wzsPSPcRdj");
        ((ArrayList) term14179).add("kGMQdqJYyB");
        ((ArrayList) term14179).add("XJJNClzHRf");
        term14170 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14170, term14170.getClass(), "opt", "vKQukfbJUd");
        setField(term14170, term14170.getClass(), "longOpt", "lFRJFUMVbx");
        setField(term14170, term14170.getClass(), "argName", "sZdUNdggUW");
        setField(term14170, term14170.getClass(), "description", "OqbwYQfvAe");
        setBooleanField(term14170, term14170.getClass(), "required", true);
        setBooleanField(term14170, term14170.getClass(), "optionalArg", false);
        setIntField(term14170, term14170.getClass(), "numberOfArgs", -6029667);
        setField(term14170, term14170.getClass(), "type", null);
        setField(term14170, term14170.getClass(), "values", term14179);
        setCharField(term14170, term14170.getClass(), "valuesep", 'u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4185;
        callMethod(klass, "handleOption", argTypes, term4076, args);
        assertTrue(recursiveEquals(term4076, term14154));
        assertTrue(recursiveEquals(term4185, term14170));
    }

};


