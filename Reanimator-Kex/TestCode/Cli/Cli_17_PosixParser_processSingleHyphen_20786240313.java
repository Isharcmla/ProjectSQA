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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class PosixParser_processSingleHyphen_20786240313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;
     Object term2170;

    public PosixParser_processSingleHyphen_20786240313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term693 = new ArrayList();
        ArrayList term751 = new ArrayList();
        HashMap term785 = new HashMap();
        HashMap term790 = new HashMap();
        ArrayList term795 = new ArrayList();
        HashMap term799 = new HashMap();
        LinkedList term777 = new LinkedList();
        ArrayList term780 = new ArrayList();
        ArrayList term804 = new ArrayList();
        term692 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term698 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term750 = newInstance(Class.forName("java.lang.Object"));
        Object term784 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term776 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term692, term692.getClass(), "tokens", term693);
        setBooleanField(term692, term692.getClass(), "eatTheRest", true);
        setField(term698, term698.getClass(), "opt", "HyxfbSQYBe");
        setField(term698, term698.getClass(), "longOpt", "pCTimMblYc");
        setField(term698, term698.getClass(), "argName", "hNxWaHcfhY");
        setField(term698, term698.getClass(), "description", "RkybSrpybU");
        setBooleanField(term698, term698.getClass(), "required", false);
        setBooleanField(term698, term698.getClass(), "optionalArg", false);
        setIntField(term698, term698.getClass(), "numberOfArgs", -1922583790);
        setField(term698, term698.getClass(), "type", term750);
        setField(term698, term698.getClass(), "values", term751);
        setCharField(term698, term698.getClass(), "valuesep", 't');
        setField(term692, term692.getClass(), "currentOption", term698);
        setField(term784, term784.getClass(), "shortOpts", term785);
        setField(term784, term784.getClass(), "longOpts", term790);
        setField(term784, term784.getClass(), "requiredOpts", term795);
        setField(term784, term784.getClass(), "optionGroups", term799);
        setField(term692, term692.getClass(), "options", term784);
        setField(term776, term776.getClass(), "args", term777);
        setField(term776, term776.getClass(), "options", term780);
        setField(term692, term692.getClass(), "cmd", term776);
        setField(term692, term692.getClass(), "requiredOptions", term804);
        ArrayList term2171 = new ArrayList();
        ((ArrayList) term2171).add("xOEqzGAmDU");
        ArrayList term2185 = new ArrayList();
        LinkedList term2188 = new LinkedList();
        ArrayList term2189 = new ArrayList();
        ArrayList term2191 = new ArrayList();
        term2170 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term2175 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2184 = newInstance(Class.forName("java.lang.Object"));
        Object term2187 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2170, term2170.getClass(), "tokens", term2171);
        setBooleanField(term2170, term2170.getClass(), "eatTheRest", true);
        setField(term2175, term2175.getClass(), "opt", "HyxfbSQYBe");
        setField(term2175, term2175.getClass(), "longOpt", "pCTimMblYc");
        setField(term2175, term2175.getClass(), "argName", "hNxWaHcfhY");
        setField(term2175, term2175.getClass(), "description", "RkybSrpybU");
        setBooleanField(term2175, term2175.getClass(), "required", false);
        setBooleanField(term2175, term2175.getClass(), "optionalArg", false);
        setIntField(term2175, term2175.getClass(), "numberOfArgs", -1922583790);
        setField(term2175, term2175.getClass(), "type", term2184);
        setField(term2175, term2175.getClass(), "values", term2185);
        setCharField(term2175, term2175.getClass(), "valuesep", 't');
        setField(term2170, term2170.getClass(), "currentOption", term2175);
        setField(term2170, term2170.getClass(), "options", null);
        setField(term2187, term2187.getClass(), "args", term2188);
        setField(term2187, term2187.getClass(), "options", term2189);
        setField(term2170, term2170.getClass(), "cmd", term2187);
        setField(term2170, term2170.getClass(), "requiredOptions", term2191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "processSingleHyphen", argTypes, term692, args);
        assertTrue(recursiveEquals(term692, term2170));
    }

};


