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
     Object term14425;
     Object term14441;

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
        LinkedList term14427 = new LinkedList();
        Object term14430 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14430, term14430.getClass(), "opt", null);
        setField(term14430, term14430.getClass(), "longOpt", null);
        setField(term14430, term14430.getClass(), "argName", null);
        setField(term14430, term14430.getClass(), "description", null);
        setBooleanField(term14430, term14430.getClass(), "required", true);
        setBooleanField(term14430, term14430.getClass(), "optionalArg", false);
        setIntField(term14430, term14430.getClass(), "numberOfArgs", -6029667);
        setField(term14430, term14430.getClass(), "type", null);
        setField(term14430, term14430.getClass(), "values", null);
        setCharField(term14430, term14430.getClass(), "valuesep", 'u');
        ArrayList term14428 = new ArrayList();
        ((ArrayList) term14428).add(term14430);
        LinkedHashMap term14432 = new LinkedHashMap();
        LinkedHashMap term14433 = new LinkedHashMap();
        ArrayList term14434 = new ArrayList();
        LinkedHashMap term14436 = new LinkedHashMap();
        ArrayList term14439 = new ArrayList();
        term14425 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term14426 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term14431 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term14426, term14426.getClass(), "args", term14427);
        setField(term14426, term14426.getClass(), "options", term14428);
        setField(term14425, term14425.getClass(), "cmd", term14426);
        setField(term14431, term14431.getClass(), "shortOpts", term14432);
        setField(term14431, term14431.getClass(), "longOpts", term14433);
        setField(term14431, term14431.getClass(), "requiredOpts", term14434);
        setField(term14431, term14431.getClass(), "optionGroups", term14436);
        setField(term14425, term14425.getClass(), "options", term14431);
        setBooleanField(term14425, term14425.getClass(), "stopAtNonOption", true);
        setField(term14425, term14425.getClass(), "currentToken", "kVEZMHmRtR");
        setField(term14425, term14425.getClass(), "currentOption", null);
        setBooleanField(term14425, term14425.getClass(), "skipParsing", false);
        setField(term14425, term14425.getClass(), "expectedOpts", term14439);
        ArrayList term14450 = new ArrayList();
        ((ArrayList) term14450).add("tRxZafjqIx");
        ((ArrayList) term14450).add("DhjNLmRMCu");
        ((ArrayList) term14450).add("PgPzMSEjjX");
        ((ArrayList) term14450).add("wzsPSPcRdj");
        ((ArrayList) term14450).add("kGMQdqJYyB");
        ((ArrayList) term14450).add("XJJNClzHRf");
        term14441 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term14441, term14441.getClass(), "opt", "vKQukfbJUd");
        setField(term14441, term14441.getClass(), "longOpt", "lFRJFUMVbx");
        setField(term14441, term14441.getClass(), "argName", "sZdUNdggUW");
        setField(term14441, term14441.getClass(), "description", "OqbwYQfvAe");
        setBooleanField(term14441, term14441.getClass(), "required", true);
        setBooleanField(term14441, term14441.getClass(), "optionalArg", false);
        setIntField(term14441, term14441.getClass(), "numberOfArgs", -6029667);
        setField(term14441, term14441.getClass(), "type", null);
        setField(term14441, term14441.getClass(), "values", term14450);
        setCharField(term14441, term14441.getClass(), "valuesep", 'u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4185;
        callMethod(klass, "handleOption", argTypes, term4076, args);
        assertTrue(recursiveEquals(term4076, term14425));
        assertTrue(recursiveEquals(term4185, term14441));
    }

};


