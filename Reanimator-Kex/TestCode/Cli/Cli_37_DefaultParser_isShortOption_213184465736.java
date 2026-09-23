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

public class DefaultParser_isShortOption_213184465736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2446;
     Object term9731;

    public DefaultParser_isShortOption_213184465736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2448 = new LinkedList();
        ArrayList term2451 = new ArrayList();
        LinkedHashMap term2456 = new LinkedHashMap();
        LinkedHashMap term2462 = new LinkedHashMap();
        ArrayList term2468 = new ArrayList();
        LinkedHashMap term2472 = new LinkedHashMap();
        ArrayList term2543 = new ArrayList();
        ((ArrayList) term2543).add("");
        ((ArrayList) term2543).add("");
        ((ArrayList) term2543).add("");
        ((ArrayList) term2543).add("");
        ArrayList term2553 = new ArrayList();
        term2446 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2447 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2455 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2491 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2447, term2447.getClass(), "args", term2448);
        setField(term2447, term2447.getClass(), "options", term2451);
        setField(term2446, term2446.getClass(), "cmd", term2447);
        setField(term2455, term2455.getClass(), "shortOpts", term2456);
        setField(term2455, term2455.getClass(), "longOpts", term2462);
        setField(term2455, term2455.getClass(), "requiredOpts", term2468);
        setField(term2455, term2455.getClass(), "optionGroups", term2472);
        setField(term2446, term2446.getClass(), "options", term2455);
        setBooleanField(term2446, term2446.getClass(), "stopAtNonOption", true);
        setField(term2446, term2446.getClass(), "currentToken", "fztQhjqwdP");
        setField(term2491, term2491.getClass(), "opt", "eVpkWxjuki");
        setField(term2491, term2491.getClass(), "longOpt", "SJiQaLvSKv");
        setField(term2491, term2491.getClass(), "argName", "OEXDRUKcFl");
        setField(term2491, term2491.getClass(), "description", "RYdKCNNMBR");
        setBooleanField(term2491, term2491.getClass(), "required", true);
        setBooleanField(term2491, term2491.getClass(), "optionalArg", false);
        setIntField(term2491, term2491.getClass(), "numberOfArgs", -522618178);
        setField(term2491, term2491.getClass(), "type", null);
        setField(term2491, term2491.getClass(), "values", term2543);
        setCharField(term2491, term2491.getClass(), "valuesep", 'j');
        setField(term2446, term2446.getClass(), "currentOption", term2491);
        setBooleanField(term2446, term2446.getClass(), "skipParsing", true);
        setField(term2446, term2446.getClass(), "expectedOpts", term2553);
        LinkedList term9733 = new LinkedList();
        ArrayList term9734 = new ArrayList();
        LinkedHashMap term9737 = new LinkedHashMap();
        LinkedHashMap term9738 = new LinkedHashMap();
        ArrayList term9739 = new ArrayList();
        LinkedHashMap term9741 = new LinkedHashMap();
        ArrayList term9753 = new ArrayList();
        ((ArrayList) term9753).add("");
        ((ArrayList) term9753).add("");
        ((ArrayList) term9753).add("");
        ((ArrayList) term9753).add("");
        ArrayList term9759 = new ArrayList();
        term9731 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9732 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9736 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9744 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9732, term9732.getClass(), "args", term9733);
        setField(term9732, term9732.getClass(), "options", term9734);
        setField(term9731, term9731.getClass(), "cmd", term9732);
        setField(term9736, term9736.getClass(), "shortOpts", term9737);
        setField(term9736, term9736.getClass(), "longOpts", term9738);
        setField(term9736, term9736.getClass(), "requiredOpts", term9739);
        setField(term9736, term9736.getClass(), "optionGroups", term9741);
        setField(term9731, term9731.getClass(), "options", term9736);
        setBooleanField(term9731, term9731.getClass(), "stopAtNonOption", true);
        setField(term9731, term9731.getClass(), "currentToken", "fztQhjqwdP");
        setField(term9744, term9744.getClass(), "opt", "eVpkWxjuki");
        setField(term9744, term9744.getClass(), "longOpt", "SJiQaLvSKv");
        setField(term9744, term9744.getClass(), "argName", "OEXDRUKcFl");
        setField(term9744, term9744.getClass(), "description", "RYdKCNNMBR");
        setBooleanField(term9744, term9744.getClass(), "required", true);
        setBooleanField(term9744, term9744.getClass(), "optionalArg", false);
        setIntField(term9744, term9744.getClass(), "numberOfArgs", -522618178);
        setField(term9744, term9744.getClass(), "type", null);
        setField(term9744, term9744.getClass(), "values", term9753);
        setCharField(term9744, term9744.getClass(), "valuesep", 'j');
        setField(term9731, term9731.getClass(), "currentOption", term9744);
        setBooleanField(term9731, term9731.getClass(), "skipParsing", true);
        setField(term9731, term9731.getClass(), "expectedOpts", term9759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        Object retValue = callMethod(klass, "isShortOption", argTypes, term2446, args);
        assertTrue(recursiveEquals(term2446, term9731));
        assertTrue(recursiveEquals(retValue, false));
    }

};


