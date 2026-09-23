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

public class DefaultParser_isArgument_8290286333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;
     Object term8239;

    public DefaultParser_isArgument_8290286333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1851 = new LinkedList();
        ArrayList term1854 = new ArrayList();
        HashMap term1859 = new HashMap();
        HashMap term1864 = new HashMap();
        ArrayList term1869 = new ArrayList();
        HashMap term1873 = new HashMap();
        ArrayList term1944 = new ArrayList();
        ArrayList term1950 = new ArrayList();
        term1849 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1850 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1858 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1891 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1943 = newInstance(Class.forName("java.lang.Object"));
        setField(term1850, term1850.getClass(), "args", term1851);
        setField(term1850, term1850.getClass(), "options", term1854);
        setField(term1849, term1849.getClass(), "cmd", term1850);
        setField(term1858, term1858.getClass(), "shortOpts", term1859);
        setField(term1858, term1858.getClass(), "longOpts", term1864);
        setField(term1858, term1858.getClass(), "requiredOpts", term1869);
        setField(term1858, term1858.getClass(), "optionGroups", term1873);
        setField(term1849, term1849.getClass(), "options", term1858);
        setBooleanField(term1849, term1849.getClass(), "stopAtNonOption", false);
        setField(term1849, term1849.getClass(), "currentToken", "nHXjMycHlU");
        setField(term1891, term1891.getClass(), "opt", "ieCtQFdkii");
        setField(term1891, term1891.getClass(), "longOpt", "dEnhdmILtU");
        setField(term1891, term1891.getClass(), "argName", "hoicvmsovO");
        setField(term1891, term1891.getClass(), "description", "eqJfYWRaEL");
        setBooleanField(term1891, term1891.getClass(), "required", true);
        setBooleanField(term1891, term1891.getClass(), "optionalArg", true);
        setIntField(term1891, term1891.getClass(), "numberOfArgs", 1227103734);
        setField(term1891, term1891.getClass(), "type", term1943);
        setField(term1891, term1891.getClass(), "values", term1944);
        setCharField(term1891, term1891.getClass(), "valuesep", 'T');
        setField(term1849, term1849.getClass(), "currentOption", term1891);
        setBooleanField(term1849, term1849.getClass(), "skipParsing", true);
        setField(term1849, term1849.getClass(), "expectedOpts", term1950);
        LinkedList term8241 = new LinkedList();
        ArrayList term8242 = new ArrayList();
        HashMap term8245 = new HashMap();
        HashMap term8246 = new HashMap();
        ArrayList term8247 = new ArrayList();
        HashMap term8249 = new HashMap();
        ArrayList term8265 = new ArrayList();
        ArrayList term8267 = new ArrayList();
        term8239 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8240 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8244 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8253 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8264 = newInstance(Class.forName("java.lang.Object"));
        setField(term8240, term8240.getClass(), "args", term8241);
        setField(term8240, term8240.getClass(), "options", term8242);
        setField(term8239, term8239.getClass(), "cmd", term8240);
        setField(term8244, term8244.getClass(), "shortOpts", term8245);
        setField(term8244, term8244.getClass(), "longOpts", term8246);
        setField(term8244, term8244.getClass(), "requiredOpts", term8247);
        setField(term8244, term8244.getClass(), "optionGroups", term8249);
        setField(term8239, term8239.getClass(), "options", term8244);
        setBooleanField(term8239, term8239.getClass(), "stopAtNonOption", false);
        setField(term8239, term8239.getClass(), "currentToken", "nHXjMycHlU");
        setField(term8253, term8253.getClass(), "opt", "ieCtQFdkii");
        setField(term8253, term8253.getClass(), "longOpt", "dEnhdmILtU");
        setField(term8253, term8253.getClass(), "argName", "hoicvmsovO");
        setField(term8253, term8253.getClass(), "description", "eqJfYWRaEL");
        setBooleanField(term8253, term8253.getClass(), "required", true);
        setBooleanField(term8253, term8253.getClass(), "optionalArg", true);
        setIntField(term8253, term8253.getClass(), "numberOfArgs", 1227103734);
        setField(term8253, term8253.getClass(), "type", term8264);
        setField(term8253, term8253.getClass(), "values", term8265);
        setCharField(term8253, term8253.getClass(), "valuesep", 'T');
        setField(term8239, term8239.getClass(), "currentOption", term8253);
        setBooleanField(term8239, term8239.getClass(), "skipParsing", true);
        setField(term8239, term8239.getClass(), "expectedOpts", term8267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        Object retValue = callMethod(klass, "isArgument", argTypes, term1849, args);
        assertTrue(recursiveEquals(term1849, term8239));
        assertTrue(recursiveEquals(retValue, true));
    }

};


