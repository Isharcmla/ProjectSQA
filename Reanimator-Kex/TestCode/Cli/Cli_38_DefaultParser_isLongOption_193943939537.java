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

public class DefaultParser_isLongOption_193943939537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2629;
     Object term10006;

    public DefaultParser_isLongOption_193943939537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2631 = new LinkedList();
        ArrayList term2634 = new ArrayList();
        LinkedHashMap term2639 = new LinkedHashMap();
        LinkedHashMap term2645 = new LinkedHashMap();
        ArrayList term2651 = new ArrayList();
        LinkedHashMap term2655 = new LinkedHashMap();
        ArrayList term2726 = new ArrayList();
        ((ArrayList) term2726).add("");
        ArrayList term2733 = new ArrayList();
        term2629 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2630 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2638 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2674 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2630, term2630.getClass(), "args", term2631);
        setField(term2630, term2630.getClass(), "options", term2634);
        setField(term2629, term2629.getClass(), "cmd", term2630);
        setField(term2638, term2638.getClass(), "shortOpts", term2639);
        setField(term2638, term2638.getClass(), "longOpts", term2645);
        setField(term2638, term2638.getClass(), "requiredOpts", term2651);
        setField(term2638, term2638.getClass(), "optionGroups", term2655);
        setField(term2629, term2629.getClass(), "options", term2638);
        setBooleanField(term2629, term2629.getClass(), "stopAtNonOption", false);
        setField(term2629, term2629.getClass(), "currentToken", "mXGCWJDOqA");
        setField(term2674, term2674.getClass(), "opt", "dpNsDgfPso");
        setField(term2674, term2674.getClass(), "longOpt", "hCWPJQKpdc");
        setField(term2674, term2674.getClass(), "argName", "WzMEhMXkKx");
        setField(term2674, term2674.getClass(), "description", "XOiDvlDhdc");
        setBooleanField(term2674, term2674.getClass(), "required", false);
        setBooleanField(term2674, term2674.getClass(), "optionalArg", true);
        setIntField(term2674, term2674.getClass(), "numberOfArgs", 1134449235);
        setField(term2674, term2674.getClass(), "type", null);
        setField(term2674, term2674.getClass(), "values", term2726);
        setCharField(term2674, term2674.getClass(), "valuesep", 'l');
        setField(term2629, term2629.getClass(), "currentOption", term2674);
        setBooleanField(term2629, term2629.getClass(), "skipParsing", false);
        setField(term2629, term2629.getClass(), "expectedOpts", term2733);
        LinkedList term10008 = new LinkedList();
        ArrayList term10009 = new ArrayList();
        LinkedHashMap term10012 = new LinkedHashMap();
        LinkedHashMap term10013 = new LinkedHashMap();
        ArrayList term10014 = new ArrayList();
        LinkedHashMap term10016 = new LinkedHashMap();
        ArrayList term10028 = new ArrayList();
        ((ArrayList) term10028).add("");
        ArrayList term10031 = new ArrayList();
        term10006 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term10007 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10011 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term10019 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10007, term10007.getClass(), "args", term10008);
        setField(term10007, term10007.getClass(), "options", term10009);
        setField(term10006, term10006.getClass(), "cmd", term10007);
        setField(term10011, term10011.getClass(), "shortOpts", term10012);
        setField(term10011, term10011.getClass(), "longOpts", term10013);
        setField(term10011, term10011.getClass(), "requiredOpts", term10014);
        setField(term10011, term10011.getClass(), "optionGroups", term10016);
        setField(term10006, term10006.getClass(), "options", term10011);
        setBooleanField(term10006, term10006.getClass(), "stopAtNonOption", false);
        setField(term10006, term10006.getClass(), "currentToken", "mXGCWJDOqA");
        setField(term10019, term10019.getClass(), "opt", "dpNsDgfPso");
        setField(term10019, term10019.getClass(), "longOpt", "hCWPJQKpdc");
        setField(term10019, term10019.getClass(), "argName", "WzMEhMXkKx");
        setField(term10019, term10019.getClass(), "description", "XOiDvlDhdc");
        setBooleanField(term10019, term10019.getClass(), "required", false);
        setBooleanField(term10019, term10019.getClass(), "optionalArg", true);
        setIntField(term10019, term10019.getClass(), "numberOfArgs", 1134449235);
        setField(term10019, term10019.getClass(), "type", null);
        setField(term10019, term10019.getClass(), "values", term10028);
        setCharField(term10019, term10019.getClass(), "valuesep", 'l');
        setField(term10006, term10006.getClass(), "currentOption", term10019);
        setBooleanField(term10006, term10006.getClass(), "skipParsing", false);
        setField(term10006, term10006.getClass(), "expectedOpts", term10031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        Object retValue = callMethod(klass, "isLongOption", argTypes, term2629, args);
        assertTrue(recursiveEquals(term2629, term10006));
        assertTrue(recursiveEquals(retValue, false));
    }

};


