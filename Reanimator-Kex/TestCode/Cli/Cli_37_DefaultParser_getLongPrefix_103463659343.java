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
     Object term12781;

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
        LinkedList term12783 = new LinkedList();
        ArrayList term12784 = new ArrayList();
        LinkedHashMap term12787 = new LinkedHashMap();
        LinkedHashMap term12788 = new LinkedHashMap();
        ArrayList term12789 = new ArrayList();
        LinkedHashMap term12791 = new LinkedHashMap();
        ArrayList term12803 = new ArrayList();
        ((ArrayList) term12803).add("");
        ((ArrayList) term12803).add("");
        ((ArrayList) term12803).add("");
        ((ArrayList) term12803).add("");
        ArrayList term12809 = new ArrayList();
        term12781 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term12782 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term12786 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term12794 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12782, term12782.getClass(), "args", term12783);
        setField(term12782, term12782.getClass(), "options", term12784);
        setField(term12781, term12781.getClass(), "cmd", term12782);
        setField(term12786, term12786.getClass(), "shortOpts", term12787);
        setField(term12786, term12786.getClass(), "longOpts", term12788);
        setField(term12786, term12786.getClass(), "requiredOpts", term12789);
        setField(term12786, term12786.getClass(), "optionGroups", term12791);
        setField(term12781, term12781.getClass(), "options", term12786);
        setBooleanField(term12781, term12781.getClass(), "stopAtNonOption", false);
        setField(term12781, term12781.getClass(), "currentToken", "smnHEqRFRx");
        setField(term12794, term12794.getClass(), "opt", "XYtryyobou");
        setField(term12794, term12794.getClass(), "longOpt", "OYbzXylRWW");
        setField(term12794, term12794.getClass(), "argName", "DSNsTGYXDF");
        setField(term12794, term12794.getClass(), "description", "sQvGcVjdEx");
        setBooleanField(term12794, term12794.getClass(), "required", false);
        setBooleanField(term12794, term12794.getClass(), "optionalArg", true);
        setIntField(term12794, term12794.getClass(), "numberOfArgs", 1622346318);
        setField(term12794, term12794.getClass(), "type", null);
        setField(term12794, term12794.getClass(), "values", term12803);
        setCharField(term12794, term12794.getClass(), "valuesep", 'r');
        setField(term12781, term12781.getClass(), "currentOption", term12794);
        setBooleanField(term12781, term12781.getClass(), "skipParsing", false);
        setField(term12781, term12781.getClass(), "expectedOpts", term12809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cudZvLMQon";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term3714, args);
        assertTrue(recursiveEquals(term3714, term12781));
        assertTrue(recursiveEquals(retValue, null));
    }

};


