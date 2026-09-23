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

public class DefaultParser_checkRequiredArgs_200729206731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1517;
     Object term7622;

    public DefaultParser_checkRequiredArgs_200729206731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1519 = new LinkedList();
        ArrayList term1522 = new ArrayList();
        HashMap term1527 = new HashMap();
        HashMap term1532 = new HashMap();
        ArrayList term1537 = new ArrayList();
        HashMap term1541 = new HashMap();
        ArrayList term1612 = new ArrayList();
        ArrayList term1618 = new ArrayList();
        term1517 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1518 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1526 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1559 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1611 = newInstance(Class.forName("java.lang.Object"));
        setField(term1518, term1518.getClass(), "args", term1519);
        setField(term1518, term1518.getClass(), "options", term1522);
        setField(term1517, term1517.getClass(), "cmd", term1518);
        setField(term1526, term1526.getClass(), "shortOpts", term1527);
        setField(term1526, term1526.getClass(), "longOpts", term1532);
        setField(term1526, term1526.getClass(), "requiredOpts", term1537);
        setField(term1526, term1526.getClass(), "optionGroups", term1541);
        setField(term1517, term1517.getClass(), "options", term1526);
        setBooleanField(term1517, term1517.getClass(), "stopAtNonOption", false);
        setField(term1517, term1517.getClass(), "currentToken", "xLbjWUgOIL");
        setField(term1559, term1559.getClass(), "opt", "jDtqGUpnZN");
        setField(term1559, term1559.getClass(), "longOpt", "nGKItKLYNC");
        setField(term1559, term1559.getClass(), "argName", "UiUYnPrcCi");
        setField(term1559, term1559.getClass(), "description", "UoYtihxVaS");
        setBooleanField(term1559, term1559.getClass(), "required", false);
        setBooleanField(term1559, term1559.getClass(), "optionalArg", true);
        setIntField(term1559, term1559.getClass(), "numberOfArgs", -1955890973);
        setField(term1559, term1559.getClass(), "type", term1611);
        setField(term1559, term1559.getClass(), "values", term1612);
        setCharField(term1559, term1559.getClass(), "valuesep", 'Z');
        setField(term1517, term1517.getClass(), "currentOption", term1559);
        setBooleanField(term1517, term1517.getClass(), "skipParsing", true);
        setField(term1517, term1517.getClass(), "expectedOpts", term1618);
        LinkedList term7624 = new LinkedList();
        ArrayList term7625 = new ArrayList();
        HashMap term7628 = new HashMap();
        HashMap term7629 = new HashMap();
        ArrayList term7630 = new ArrayList();
        HashMap term7632 = new HashMap();
        ArrayList term7645 = new ArrayList();
        ArrayList term7647 = new ArrayList();
        term7622 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term7623 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term7627 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term7635 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7644 = newInstance(Class.forName("java.lang.Object"));
        setField(term7623, term7623.getClass(), "args", term7624);
        setField(term7623, term7623.getClass(), "options", term7625);
        setField(term7622, term7622.getClass(), "cmd", term7623);
        setField(term7627, term7627.getClass(), "shortOpts", term7628);
        setField(term7627, term7627.getClass(), "longOpts", term7629);
        setField(term7627, term7627.getClass(), "requiredOpts", term7630);
        setField(term7627, term7627.getClass(), "optionGroups", term7632);
        setField(term7622, term7622.getClass(), "options", term7627);
        setBooleanField(term7622, term7622.getClass(), "stopAtNonOption", false);
        setField(term7622, term7622.getClass(), "currentToken", "xLbjWUgOIL");
        setField(term7635, term7635.getClass(), "opt", "jDtqGUpnZN");
        setField(term7635, term7635.getClass(), "longOpt", "nGKItKLYNC");
        setField(term7635, term7635.getClass(), "argName", "UiUYnPrcCi");
        setField(term7635, term7635.getClass(), "description", "UoYtihxVaS");
        setBooleanField(term7635, term7635.getClass(), "required", false);
        setBooleanField(term7635, term7635.getClass(), "optionalArg", true);
        setIntField(term7635, term7635.getClass(), "numberOfArgs", -1955890973);
        setField(term7635, term7635.getClass(), "type", term7644);
        setField(term7635, term7635.getClass(), "values", term7645);
        setCharField(term7635, term7635.getClass(), "valuesep", 'Z');
        setField(term7622, term7622.getClass(), "currentOption", term7635);
        setBooleanField(term7622, term7622.getClass(), "skipParsing", true);
        setField(term7622, term7622.getClass(), "expectedOpts", term7647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkRequiredArgs", argTypes, term1517, args);
        assertTrue(recursiveEquals(term1517, term7622));
    }

};


