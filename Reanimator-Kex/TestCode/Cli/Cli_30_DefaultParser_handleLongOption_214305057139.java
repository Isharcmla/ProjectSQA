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
import java.util.HashMap;

public class DefaultParser_handleLongOption_214305057139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2911;
     Object term10177;

    public DefaultParser_handleLongOption_214305057139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2913 = new LinkedList();
        ArrayList term2916 = new ArrayList();
        HashMap term2921 = new HashMap();
        HashMap term2926 = new HashMap();
        ArrayList term2931 = new ArrayList();
        HashMap term2935 = new HashMap();
        ArrayList term3006 = new ArrayList();
        ArrayList term3012 = new ArrayList();
        term2911 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2912 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2920 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2953 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3005 = newInstance(Class.forName("java.lang.Object"));
        setField(term2912, term2912.getClass(), "args", term2913);
        setField(term2912, term2912.getClass(), "options", term2916);
        setField(term2911, term2911.getClass(), "cmd", term2912);
        setField(term2920, term2920.getClass(), "shortOpts", term2921);
        setField(term2920, term2920.getClass(), "longOpts", term2926);
        setField(term2920, term2920.getClass(), "requiredOpts", term2931);
        setField(term2920, term2920.getClass(), "optionGroups", term2935);
        setField(term2911, term2911.getClass(), "options", term2920);
        setBooleanField(term2911, term2911.getClass(), "stopAtNonOption", false);
        setField(term2911, term2911.getClass(), "currentToken", "DfISiziTgG");
        setField(term2953, term2953.getClass(), "opt", "XqgfKFvPSD");
        setField(term2953, term2953.getClass(), "longOpt", "JiVRgTZvKc");
        setField(term2953, term2953.getClass(), "argName", "XPKmummaqg");
        setField(term2953, term2953.getClass(), "description", "BKLfkLiZTH");
        setBooleanField(term2953, term2953.getClass(), "required", false);
        setBooleanField(term2953, term2953.getClass(), "optionalArg", false);
        setIntField(term2953, term2953.getClass(), "numberOfArgs", 1585847225);
        setField(term2953, term2953.getClass(), "type", term3005);
        setField(term2953, term2953.getClass(), "values", term3006);
        setCharField(term2953, term2953.getClass(), "valuesep", 'A');
        setField(term2911, term2911.getClass(), "currentOption", term2953);
        setBooleanField(term2911, term2911.getClass(), "skipParsing", false);
        setField(term2911, term2911.getClass(), "expectedOpts", term3012);
        LinkedList term10179 = new LinkedList();
        ((LinkedList) term10179).add("");
        ArrayList term10182 = new ArrayList();
        HashMap term10185 = new HashMap();
        HashMap term10186 = new HashMap();
        ArrayList term10188 = new ArrayList();
        HashMap term10190 = new HashMap();
        ArrayList term10203 = new ArrayList();
        ArrayList term10205 = new ArrayList();
        term10177 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term10178 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10184 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term10193 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10202 = newInstance(Class.forName("java.lang.Object"));
        setField(term10178, term10178.getClass(), "args", term10179);
        setField(term10178, term10178.getClass(), "options", term10182);
        setField(term10177, term10177.getClass(), "cmd", term10178);
        setField(term10184, term10184.getClass(), "shortOpts", term10185);
        setField(term10184, term10184.getClass(), "longOpts", term10186);
        setField(term10184, term10184.getClass(), "requiredOpts", term10188);
        setField(term10184, term10184.getClass(), "optionGroups", term10190);
        setField(term10177, term10177.getClass(), "options", term10184);
        setBooleanField(term10177, term10177.getClass(), "stopAtNonOption", false);
        setField(term10177, term10177.getClass(), "currentToken", "DfISiziTgG");
        setField(term10193, term10193.getClass(), "opt", "XqgfKFvPSD");
        setField(term10193, term10193.getClass(), "longOpt", "JiVRgTZvKc");
        setField(term10193, term10193.getClass(), "argName", "XPKmummaqg");
        setField(term10193, term10193.getClass(), "description", "BKLfkLiZTH");
        setBooleanField(term10193, term10193.getClass(), "required", false);
        setBooleanField(term10193, term10193.getClass(), "optionalArg", false);
        setIntField(term10193, term10193.getClass(), "numberOfArgs", 1585847225);
        setField(term10193, term10193.getClass(), "type", term10202);
        setField(term10193, term10193.getClass(), "values", term10203);
        setCharField(term10193, term10193.getClass(), "valuesep", 'A');
        setField(term10177, term10177.getClass(), "currentOption", term10193);
        setBooleanField(term10177, term10177.getClass(), "skipParsing", false);
        setField(term10177, term10177.getClass(), "expectedOpts", term10205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "handleLongOption", argTypes, term2911, args);
        assertTrue(recursiveEquals(term2911, term10177));
    }

};


