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

public class DefaultParser_handleUnknownToken_40609611538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2809;
     Object term10307;

    public DefaultParser_handleUnknownToken_40609611538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2811 = new LinkedList();
        ArrayList term2814 = new ArrayList();
        LinkedHashMap term2819 = new LinkedHashMap();
        LinkedHashMap term2825 = new LinkedHashMap();
        ArrayList term2831 = new ArrayList();
        LinkedHashMap term2835 = new LinkedHashMap();
        ArrayList term2906 = new ArrayList();
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ((ArrayList) term2906).add("");
        ArrayList term2919 = new ArrayList();
        term2809 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2810 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2818 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2854 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2810, term2810.getClass(), "args", term2811);
        setField(term2810, term2810.getClass(), "options", term2814);
        setField(term2809, term2809.getClass(), "cmd", term2810);
        setField(term2818, term2818.getClass(), "shortOpts", term2819);
        setField(term2818, term2818.getClass(), "longOpts", term2825);
        setField(term2818, term2818.getClass(), "requiredOpts", term2831);
        setField(term2818, term2818.getClass(), "optionGroups", term2835);
        setField(term2809, term2809.getClass(), "options", term2818);
        setBooleanField(term2809, term2809.getClass(), "stopAtNonOption", true);
        setField(term2809, term2809.getClass(), "currentToken", "JDaAnsVTGV");
        setField(term2854, term2854.getClass(), "opt", "mLUZFTfjle");
        setField(term2854, term2854.getClass(), "longOpt", "xIeFjkHkOe");
        setField(term2854, term2854.getClass(), "argName", "SdCKLMIYnX");
        setField(term2854, term2854.getClass(), "description", "OJJtVNPyKZ");
        setBooleanField(term2854, term2854.getClass(), "required", false);
        setBooleanField(term2854, term2854.getClass(), "optionalArg", false);
        setIntField(term2854, term2854.getClass(), "numberOfArgs", -883034806);
        setField(term2854, term2854.getClass(), "type", null);
        setField(term2854, term2854.getClass(), "values", term2906);
        setCharField(term2854, term2854.getClass(), "valuesep", 'J');
        setField(term2809, term2809.getClass(), "currentOption", term2854);
        setBooleanField(term2809, term2809.getClass(), "skipParsing", true);
        setField(term2809, term2809.getClass(), "expectedOpts", term2919);
        LinkedList term10309 = new LinkedList();
        ((LinkedList) term10309).add("");
        ArrayList term10312 = new ArrayList();
        LinkedHashMap term10315 = new LinkedHashMap();
        LinkedHashMap term10316 = new LinkedHashMap();
        ArrayList term10317 = new ArrayList();
        LinkedHashMap term10319 = new LinkedHashMap();
        ArrayList term10331 = new ArrayList();
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ((ArrayList) term10331).add("");
        ArrayList term10340 = new ArrayList();
        term10307 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term10308 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10314 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term10322 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10308, term10308.getClass(), "args", term10309);
        setField(term10308, term10308.getClass(), "options", term10312);
        setField(term10307, term10307.getClass(), "cmd", term10308);
        setField(term10314, term10314.getClass(), "shortOpts", term10315);
        setField(term10314, term10314.getClass(), "longOpts", term10316);
        setField(term10314, term10314.getClass(), "requiredOpts", term10317);
        setField(term10314, term10314.getClass(), "optionGroups", term10319);
        setField(term10307, term10307.getClass(), "options", term10314);
        setBooleanField(term10307, term10307.getClass(), "stopAtNonOption", true);
        setField(term10307, term10307.getClass(), "currentToken", "JDaAnsVTGV");
        setField(term10322, term10322.getClass(), "opt", "mLUZFTfjle");
        setField(term10322, term10322.getClass(), "longOpt", "xIeFjkHkOe");
        setField(term10322, term10322.getClass(), "argName", "SdCKLMIYnX");
        setField(term10322, term10322.getClass(), "description", "OJJtVNPyKZ");
        setBooleanField(term10322, term10322.getClass(), "required", false);
        setBooleanField(term10322, term10322.getClass(), "optionalArg", false);
        setIntField(term10322, term10322.getClass(), "numberOfArgs", -883034806);
        setField(term10322, term10322.getClass(), "type", null);
        setField(term10322, term10322.getClass(), "values", term10331);
        setCharField(term10322, term10322.getClass(), "valuesep", 'J');
        setField(term10307, term10307.getClass(), "currentOption", term10322);
        setBooleanField(term10307, term10307.getClass(), "skipParsing", true);
        setField(term10307, term10307.getClass(), "expectedOpts", term10340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "handleUnknownToken", argTypes, term2809, args);
        assertTrue(recursiveEquals(term2809, term10307));
    }

};


