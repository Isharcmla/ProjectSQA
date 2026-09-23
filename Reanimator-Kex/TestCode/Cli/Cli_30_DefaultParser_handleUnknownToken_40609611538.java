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

public class DefaultParser_handleUnknownToken_40609611538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2734;
     Object term9828;

    public DefaultParser_handleUnknownToken_40609611538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2736 = new LinkedList();
        ArrayList term2739 = new ArrayList();
        HashMap term2744 = new HashMap();
        HashMap term2749 = new HashMap();
        ArrayList term2754 = new ArrayList();
        HashMap term2758 = new HashMap();
        ArrayList term2829 = new ArrayList();
        ArrayList term2835 = new ArrayList();
        term2734 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2735 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2743 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2776 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2828 = newInstance(Class.forName("java.lang.Object"));
        setField(term2735, term2735.getClass(), "args", term2736);
        setField(term2735, term2735.getClass(), "options", term2739);
        setField(term2734, term2734.getClass(), "cmd", term2735);
        setField(term2743, term2743.getClass(), "shortOpts", term2744);
        setField(term2743, term2743.getClass(), "longOpts", term2749);
        setField(term2743, term2743.getClass(), "requiredOpts", term2754);
        setField(term2743, term2743.getClass(), "optionGroups", term2758);
        setField(term2734, term2734.getClass(), "options", term2743);
        setBooleanField(term2734, term2734.getClass(), "stopAtNonOption", true);
        setField(term2734, term2734.getClass(), "currentToken", "jSpAteRute");
        setField(term2776, term2776.getClass(), "opt", "swZVeJAxjt");
        setField(term2776, term2776.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term2776, term2776.getClass(), "argName", "GVizqqzXpy");
        setField(term2776, term2776.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term2776, term2776.getClass(), "required", false);
        setBooleanField(term2776, term2776.getClass(), "optionalArg", false);
        setIntField(term2776, term2776.getClass(), "numberOfArgs", -883034806);
        setField(term2776, term2776.getClass(), "type", term2828);
        setField(term2776, term2776.getClass(), "values", term2829);
        setCharField(term2776, term2776.getClass(), "valuesep", 'J');
        setField(term2734, term2734.getClass(), "currentOption", term2776);
        setBooleanField(term2734, term2734.getClass(), "skipParsing", true);
        setField(term2734, term2734.getClass(), "expectedOpts", term2835);
        LinkedList term9830 = new LinkedList();
        ((LinkedList) term9830).add("");
        ArrayList term9833 = new ArrayList();
        HashMap term9836 = new HashMap();
        HashMap term9837 = new HashMap();
        ArrayList term9838 = new ArrayList();
        HashMap term9840 = new HashMap();
        ArrayList term9853 = new ArrayList();
        ArrayList term9855 = new ArrayList();
        term9828 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9829 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9835 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9843 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term9852 = newInstance(Class.forName("java.lang.Object"));
        setField(term9829, term9829.getClass(), "args", term9830);
        setField(term9829, term9829.getClass(), "options", term9833);
        setField(term9828, term9828.getClass(), "cmd", term9829);
        setField(term9835, term9835.getClass(), "shortOpts", term9836);
        setField(term9835, term9835.getClass(), "longOpts", term9837);
        setField(term9835, term9835.getClass(), "requiredOpts", term9838);
        setField(term9835, term9835.getClass(), "optionGroups", term9840);
        setField(term9828, term9828.getClass(), "options", term9835);
        setBooleanField(term9828, term9828.getClass(), "stopAtNonOption", true);
        setField(term9828, term9828.getClass(), "currentToken", "jSpAteRute");
        setField(term9843, term9843.getClass(), "opt", "swZVeJAxjt");
        setField(term9843, term9843.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term9843, term9843.getClass(), "argName", "GVizqqzXpy");
        setField(term9843, term9843.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term9843, term9843.getClass(), "required", false);
        setBooleanField(term9843, term9843.getClass(), "optionalArg", false);
        setIntField(term9843, term9843.getClass(), "numberOfArgs", -883034806);
        setField(term9843, term9843.getClass(), "type", term9852);
        setField(term9843, term9843.getClass(), "values", term9853);
        setCharField(term9843, term9843.getClass(), "valuesep", 'J');
        setField(term9828, term9828.getClass(), "currentOption", term9843);
        setBooleanField(term9828, term9828.getClass(), "skipParsing", true);
        setField(term9828, term9828.getClass(), "expectedOpts", term9855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "handleUnknownToken", argTypes, term2734, args);
        assertTrue(recursiveEquals(term2734, term9828));
    }

};


