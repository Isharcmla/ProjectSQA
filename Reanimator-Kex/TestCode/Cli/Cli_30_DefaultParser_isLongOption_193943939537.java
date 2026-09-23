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

public class DefaultParser_isLongOption_193943939537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2557;
     Object term9536;

    public DefaultParser_isLongOption_193943939537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2559 = new LinkedList();
        ArrayList term2562 = new ArrayList();
        HashMap term2567 = new HashMap();
        HashMap term2572 = new HashMap();
        ArrayList term2577 = new ArrayList();
        HashMap term2581 = new HashMap();
        ArrayList term2652 = new ArrayList();
        ArrayList term2658 = new ArrayList();
        term2557 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2558 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2566 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2599 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2651 = newInstance(Class.forName("java.lang.Object"));
        setField(term2558, term2558.getClass(), "args", term2559);
        setField(term2558, term2558.getClass(), "options", term2562);
        setField(term2557, term2557.getClass(), "cmd", term2558);
        setField(term2566, term2566.getClass(), "shortOpts", term2567);
        setField(term2566, term2566.getClass(), "longOpts", term2572);
        setField(term2566, term2566.getClass(), "requiredOpts", term2577);
        setField(term2566, term2566.getClass(), "optionGroups", term2581);
        setField(term2557, term2557.getClass(), "options", term2566);
        setBooleanField(term2557, term2557.getClass(), "stopAtNonOption", false);
        setField(term2557, term2557.getClass(), "currentToken", "bWWfajKbEX");
        setField(term2599, term2599.getClass(), "opt", "cAPeiZHKGJ");
        setField(term2599, term2599.getClass(), "longOpt", "LvJFtLBaxj");
        setField(term2599, term2599.getClass(), "argName", "PHvxnGHptP");
        setField(term2599, term2599.getClass(), "description", "TimdotUuNC");
        setBooleanField(term2599, term2599.getClass(), "required", false);
        setBooleanField(term2599, term2599.getClass(), "optionalArg", true);
        setIntField(term2599, term2599.getClass(), "numberOfArgs", 1134449235);
        setField(term2599, term2599.getClass(), "type", term2651);
        setField(term2599, term2599.getClass(), "values", term2652);
        setCharField(term2599, term2599.getClass(), "valuesep", 'l');
        setField(term2557, term2557.getClass(), "currentOption", term2599);
        setBooleanField(term2557, term2557.getClass(), "skipParsing", false);
        setField(term2557, term2557.getClass(), "expectedOpts", term2658);
        LinkedList term9538 = new LinkedList();
        ArrayList term9539 = new ArrayList();
        HashMap term9542 = new HashMap();
        HashMap term9543 = new HashMap();
        ArrayList term9544 = new ArrayList();
        HashMap term9546 = new HashMap();
        ArrayList term9559 = new ArrayList();
        ArrayList term9561 = new ArrayList();
        term9536 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9537 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9541 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9549 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term9558 = newInstance(Class.forName("java.lang.Object"));
        setField(term9537, term9537.getClass(), "args", term9538);
        setField(term9537, term9537.getClass(), "options", term9539);
        setField(term9536, term9536.getClass(), "cmd", term9537);
        setField(term9541, term9541.getClass(), "shortOpts", term9542);
        setField(term9541, term9541.getClass(), "longOpts", term9543);
        setField(term9541, term9541.getClass(), "requiredOpts", term9544);
        setField(term9541, term9541.getClass(), "optionGroups", term9546);
        setField(term9536, term9536.getClass(), "options", term9541);
        setBooleanField(term9536, term9536.getClass(), "stopAtNonOption", false);
        setField(term9536, term9536.getClass(), "currentToken", "bWWfajKbEX");
        setField(term9549, term9549.getClass(), "opt", "cAPeiZHKGJ");
        setField(term9549, term9549.getClass(), "longOpt", "LvJFtLBaxj");
        setField(term9549, term9549.getClass(), "argName", "PHvxnGHptP");
        setField(term9549, term9549.getClass(), "description", "TimdotUuNC");
        setBooleanField(term9549, term9549.getClass(), "required", false);
        setBooleanField(term9549, term9549.getClass(), "optionalArg", true);
        setIntField(term9549, term9549.getClass(), "numberOfArgs", 1134449235);
        setField(term9549, term9549.getClass(), "type", term9558);
        setField(term9549, term9549.getClass(), "values", term9559);
        setCharField(term9549, term9549.getClass(), "valuesep", 'l');
        setField(term9536, term9536.getClass(), "currentOption", term9549);
        setBooleanField(term9536, term9536.getClass(), "skipParsing", false);
        setField(term9536, term9536.getClass(), "expectedOpts", term9561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        Object retValue = callMethod(klass, "isLongOption", argTypes, term2557, args);
        assertTrue(recursiveEquals(term2557, term9536));
        assertTrue(recursiveEquals(retValue, false));
    }

};


