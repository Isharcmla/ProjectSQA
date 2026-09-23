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

public class DefaultParser_getLongPrefix_103463659343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3714;
     Object term13115;

    public DefaultParser_getLongPrefix_103463659343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3716 = new LinkedList();
        ArrayList term3719 = new ArrayList();
        LinkedHashMap term3724 = new LinkedHashMap();
        LinkedHashMap term3730 = new LinkedHashMap();
        ArrayList term3736 = new ArrayList();
        LinkedHashMap term3740 = new LinkedHashMap();
        ArrayList term3811 = new ArrayList();
        ((ArrayList) term3811).add("");
        ((ArrayList) term3811).add("");
        ((ArrayList) term3811).add("");
        ((ArrayList) term3811).add("");
        ArrayList term3821 = new ArrayList();
        term3714 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3715 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3723 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3759 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3715, term3715.getClass(), "args", term3716);
        setField(term3715, term3715.getClass(), "options", term3719);
        setField(term3714, term3714.getClass(), "cmd", term3715);
        setField(term3723, term3723.getClass(), "shortOpts", term3724);
        setField(term3723, term3723.getClass(), "longOpts", term3730);
        setField(term3723, term3723.getClass(), "requiredOpts", term3736);
        setField(term3723, term3723.getClass(), "optionGroups", term3740);
        setField(term3714, term3714.getClass(), "options", term3723);
        setBooleanField(term3714, term3714.getClass(), "stopAtNonOption", false);
        setField(term3714, term3714.getClass(), "currentToken", "smnHEqRFRx");
        setField(term3759, term3759.getClass(), "opt", "XYtryyobou");
        setField(term3759, term3759.getClass(), "longOpt", "OYbzXylRWW");
        setField(term3759, term3759.getClass(), "argName", "DSNsTGYXDF");
        setField(term3759, term3759.getClass(), "description", "sQvGcVjdEx");
        setBooleanField(term3759, term3759.getClass(), "required", false);
        setBooleanField(term3759, term3759.getClass(), "optionalArg", true);
        setIntField(term3759, term3759.getClass(), "numberOfArgs", 1622346318);
        setField(term3759, term3759.getClass(), "type", null);
        setField(term3759, term3759.getClass(), "values", term3811);
        setCharField(term3759, term3759.getClass(), "valuesep", 'r');
        setField(term3714, term3714.getClass(), "currentOption", term3759);
        setBooleanField(term3714, term3714.getClass(), "skipParsing", false);
        setField(term3714, term3714.getClass(), "expectedOpts", term3821);
        LinkedList term13117 = new LinkedList();
        ArrayList term13118 = new ArrayList();
        LinkedHashMap term13121 = new LinkedHashMap();
        LinkedHashMap term13122 = new LinkedHashMap();
        ArrayList term13123 = new ArrayList();
        LinkedHashMap term13125 = new LinkedHashMap();
        ArrayList term13137 = new ArrayList();
        ((ArrayList) term13137).add("");
        ((ArrayList) term13137).add("");
        ((ArrayList) term13137).add("");
        ((ArrayList) term13137).add("");
        ArrayList term13143 = new ArrayList();
        term13115 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term13116 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term13120 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term13128 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13116, term13116.getClass(), "args", term13117);
        setField(term13116, term13116.getClass(), "options", term13118);
        setField(term13115, term13115.getClass(), "cmd", term13116);
        setField(term13120, term13120.getClass(), "shortOpts", term13121);
        setField(term13120, term13120.getClass(), "longOpts", term13122);
        setField(term13120, term13120.getClass(), "requiredOpts", term13123);
        setField(term13120, term13120.getClass(), "optionGroups", term13125);
        setField(term13115, term13115.getClass(), "options", term13120);
        setBooleanField(term13115, term13115.getClass(), "stopAtNonOption", false);
        setField(term13115, term13115.getClass(), "currentToken", "smnHEqRFRx");
        setField(term13128, term13128.getClass(), "opt", "XYtryyobou");
        setField(term13128, term13128.getClass(), "longOpt", "OYbzXylRWW");
        setField(term13128, term13128.getClass(), "argName", "DSNsTGYXDF");
        setField(term13128, term13128.getClass(), "description", "sQvGcVjdEx");
        setBooleanField(term13128, term13128.getClass(), "required", false);
        setBooleanField(term13128, term13128.getClass(), "optionalArg", true);
        setIntField(term13128, term13128.getClass(), "numberOfArgs", 1622346318);
        setField(term13128, term13128.getClass(), "type", null);
        setField(term13128, term13128.getClass(), "values", term13137);
        setCharField(term13128, term13128.getClass(), "valuesep", 'r');
        setField(term13115, term13115.getClass(), "currentOption", term13128);
        setBooleanField(term13115, term13115.getClass(), "skipParsing", false);
        setField(term13115, term13115.getClass(), "expectedOpts", term13143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cudZvLMQon";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term3714, args);
        assertTrue(recursiveEquals(term3714, term13115));
        assertTrue(recursiveEquals(retValue, null));
    }

};


