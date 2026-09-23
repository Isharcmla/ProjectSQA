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

public class DefaultParser_isOption_1083123935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2263;
     Object term9453;

    public DefaultParser_isOption_1083123935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2265 = new LinkedList();
        ArrayList term2268 = new ArrayList();
        LinkedHashMap term2273 = new LinkedHashMap();
        LinkedHashMap term2279 = new LinkedHashMap();
        ArrayList term2285 = new ArrayList();
        LinkedHashMap term2289 = new LinkedHashMap();
        ArrayList term2360 = new ArrayList();
        ((ArrayList) term2360).add("");
        ((ArrayList) term2360).add("");
        ((ArrayList) term2360).add("");
        ((ArrayList) term2360).add("");
        ArrayList term2370 = new ArrayList();
        term2263 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2264 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2272 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2308 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2264, term2264.getClass(), "args", term2265);
        setField(term2264, term2264.getClass(), "options", term2268);
        setField(term2263, term2263.getClass(), "cmd", term2264);
        setField(term2272, term2272.getClass(), "shortOpts", term2273);
        setField(term2272, term2272.getClass(), "longOpts", term2279);
        setField(term2272, term2272.getClass(), "requiredOpts", term2285);
        setField(term2272, term2272.getClass(), "optionGroups", term2289);
        setField(term2263, term2263.getClass(), "options", term2272);
        setBooleanField(term2263, term2263.getClass(), "stopAtNonOption", true);
        setField(term2263, term2263.getClass(), "currentToken", "BKLfkLiZTH");
        setField(term2308, term2308.getClass(), "opt", "SPpkrGcPRr");
        setField(term2308, term2308.getClass(), "longOpt", "sEccwbJKYE");
        setField(term2308, term2308.getClass(), "argName", "AWRooQKkdW");
        setField(term2308, term2308.getClass(), "description", "vjxIhXHxGR");
        setBooleanField(term2308, term2308.getClass(), "required", true);
        setBooleanField(term2308, term2308.getClass(), "optionalArg", false);
        setIntField(term2308, term2308.getClass(), "numberOfArgs", 1725571209);
        setField(term2308, term2308.getClass(), "type", null);
        setField(term2308, term2308.getClass(), "values", term2360);
        setCharField(term2308, term2308.getClass(), "valuesep", 's');
        setField(term2263, term2263.getClass(), "currentOption", term2308);
        setBooleanField(term2263, term2263.getClass(), "skipParsing", true);
        setField(term2263, term2263.getClass(), "expectedOpts", term2370);
        LinkedList term9455 = new LinkedList();
        ArrayList term9456 = new ArrayList();
        LinkedHashMap term9459 = new LinkedHashMap();
        LinkedHashMap term9460 = new LinkedHashMap();
        ArrayList term9461 = new ArrayList();
        LinkedHashMap term9463 = new LinkedHashMap();
        ArrayList term9475 = new ArrayList();
        ((ArrayList) term9475).add("");
        ((ArrayList) term9475).add("");
        ((ArrayList) term9475).add("");
        ((ArrayList) term9475).add("");
        ArrayList term9481 = new ArrayList();
        term9453 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9454 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9458 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9466 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9454, term9454.getClass(), "args", term9455);
        setField(term9454, term9454.getClass(), "options", term9456);
        setField(term9453, term9453.getClass(), "cmd", term9454);
        setField(term9458, term9458.getClass(), "shortOpts", term9459);
        setField(term9458, term9458.getClass(), "longOpts", term9460);
        setField(term9458, term9458.getClass(), "requiredOpts", term9461);
        setField(term9458, term9458.getClass(), "optionGroups", term9463);
        setField(term9453, term9453.getClass(), "options", term9458);
        setBooleanField(term9453, term9453.getClass(), "stopAtNonOption", true);
        setField(term9453, term9453.getClass(), "currentToken", "BKLfkLiZTH");
        setField(term9466, term9466.getClass(), "opt", "SPpkrGcPRr");
        setField(term9466, term9466.getClass(), "longOpt", "sEccwbJKYE");
        setField(term9466, term9466.getClass(), "argName", "AWRooQKkdW");
        setField(term9466, term9466.getClass(), "description", "vjxIhXHxGR");
        setBooleanField(term9466, term9466.getClass(), "required", true);
        setBooleanField(term9466, term9466.getClass(), "optionalArg", false);
        setIntField(term9466, term9466.getClass(), "numberOfArgs", 1725571209);
        setField(term9466, term9466.getClass(), "type", null);
        setField(term9466, term9466.getClass(), "values", term9475);
        setCharField(term9466, term9466.getClass(), "valuesep", 's');
        setField(term9453, term9453.getClass(), "currentOption", term9466);
        setBooleanField(term9453, term9453.getClass(), "skipParsing", true);
        setField(term9453, term9453.getClass(), "expectedOpts", term9481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        Object retValue = callMethod(klass, "isOption", argTypes, term2263, args);
        assertTrue(recursiveEquals(term2263, term9453));
        assertTrue(recursiveEquals(retValue, false));
    }

};


