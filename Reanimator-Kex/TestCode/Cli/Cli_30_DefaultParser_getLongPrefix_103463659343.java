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

public class DefaultParser_getLongPrefix_103463659343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3619;
     Object term12218;

    public DefaultParser_getLongPrefix_103463659343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3621 = new LinkedList();
        ArrayList term3624 = new ArrayList();
        HashMap term3629 = new HashMap();
        HashMap term3634 = new HashMap();
        ArrayList term3639 = new ArrayList();
        HashMap term3643 = new HashMap();
        ArrayList term3714 = new ArrayList();
        ArrayList term3720 = new ArrayList();
        term3619 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3620 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3628 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3661 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3713 = newInstance(Class.forName("java.lang.Object"));
        setField(term3620, term3620.getClass(), "args", term3621);
        setField(term3620, term3620.getClass(), "options", term3624);
        setField(term3619, term3619.getClass(), "cmd", term3620);
        setField(term3628, term3628.getClass(), "shortOpts", term3629);
        setField(term3628, term3628.getClass(), "longOpts", term3634);
        setField(term3628, term3628.getClass(), "requiredOpts", term3639);
        setField(term3628, term3628.getClass(), "optionGroups", term3643);
        setField(term3619, term3619.getClass(), "options", term3628);
        setBooleanField(term3619, term3619.getClass(), "stopAtNonOption", false);
        setField(term3619, term3619.getClass(), "currentToken", "mXGCWJDOqA");
        setField(term3661, term3661.getClass(), "opt", "dpNsDgfPso");
        setField(term3661, term3661.getClass(), "longOpt", "hCWPJQKpdc");
        setField(term3661, term3661.getClass(), "argName", "WzMEhMXkKx");
        setField(term3661, term3661.getClass(), "description", "XOiDvlDhdc");
        setBooleanField(term3661, term3661.getClass(), "required", false);
        setBooleanField(term3661, term3661.getClass(), "optionalArg", true);
        setIntField(term3661, term3661.getClass(), "numberOfArgs", 1622346318);
        setField(term3661, term3661.getClass(), "type", term3713);
        setField(term3661, term3661.getClass(), "values", term3714);
        setCharField(term3661, term3661.getClass(), "valuesep", 'r');
        setField(term3619, term3619.getClass(), "currentOption", term3661);
        setBooleanField(term3619, term3619.getClass(), "skipParsing", false);
        setField(term3619, term3619.getClass(), "expectedOpts", term3720);
        LinkedList term12220 = new LinkedList();
        ArrayList term12221 = new ArrayList();
        HashMap term12224 = new HashMap();
        HashMap term12225 = new HashMap();
        ArrayList term12226 = new ArrayList();
        HashMap term12228 = new HashMap();
        ArrayList term12241 = new ArrayList();
        ArrayList term12243 = new ArrayList();
        term12218 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term12219 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term12223 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term12231 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term12240 = newInstance(Class.forName("java.lang.Object"));
        setField(term12219, term12219.getClass(), "args", term12220);
        setField(term12219, term12219.getClass(), "options", term12221);
        setField(term12218, term12218.getClass(), "cmd", term12219);
        setField(term12223, term12223.getClass(), "shortOpts", term12224);
        setField(term12223, term12223.getClass(), "longOpts", term12225);
        setField(term12223, term12223.getClass(), "requiredOpts", term12226);
        setField(term12223, term12223.getClass(), "optionGroups", term12228);
        setField(term12218, term12218.getClass(), "options", term12223);
        setBooleanField(term12218, term12218.getClass(), "stopAtNonOption", false);
        setField(term12218, term12218.getClass(), "currentToken", "mXGCWJDOqA");
        setField(term12231, term12231.getClass(), "opt", "dpNsDgfPso");
        setField(term12231, term12231.getClass(), "longOpt", "hCWPJQKpdc");
        setField(term12231, term12231.getClass(), "argName", "WzMEhMXkKx");
        setField(term12231, term12231.getClass(), "description", "XOiDvlDhdc");
        setBooleanField(term12231, term12231.getClass(), "required", false);
        setBooleanField(term12231, term12231.getClass(), "optionalArg", true);
        setIntField(term12231, term12231.getClass(), "numberOfArgs", 1622346318);
        setField(term12231, term12231.getClass(), "type", term12240);
        setField(term12231, term12231.getClass(), "values", term12241);
        setCharField(term12231, term12231.getClass(), "valuesep", 'r');
        setField(term12218, term12218.getClass(), "currentOption", term12231);
        setBooleanField(term12218, term12218.getClass(), "skipParsing", false);
        setField(term12218, term12218.getClass(), "expectedOpts", term12243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        Object retValue = callMethod(klass, "getLongPrefix", argTypes, term3619, args);
        assertTrue(recursiveEquals(term3619, term12218));
        assertTrue(recursiveEquals(retValue, null));
    }

};


