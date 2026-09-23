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
import java.lang.Boolean;

public class DefaultParser_parse_105771338227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term703;
     Object term726;
     Object term835;
     Object term6673;
     Object term6701;
     Object term6708;
     Object term6009;

    public DefaultParser_parse_105771338227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term598 = new LinkedList();
        ArrayList term601 = new ArrayList();
        LinkedHashMap term606 = new LinkedHashMap();
        LinkedHashMap term612 = new LinkedHashMap();
        ArrayList term618 = new ArrayList();
        LinkedHashMap term622 = new LinkedHashMap();
        ArrayList term693 = new ArrayList();
        ArrayList term699 = new ArrayList();
        term596 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term597 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term605 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term641 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term597, term597.getClass(), "args", term598);
        setField(term597, term597.getClass(), "options", term601);
        setField(term596, term596.getClass(), "cmd", term597);
        setField(term605, term605.getClass(), "shortOpts", term606);
        setField(term605, term605.getClass(), "longOpts", term612);
        setField(term605, term605.getClass(), "requiredOpts", term618);
        setField(term605, term605.getClass(), "optionGroups", term622);
        setField(term596, term596.getClass(), "options", term605);
        setBooleanField(term596, term596.getClass(), "stopAtNonOption", false);
        setField(term596, term596.getClass(), "currentToken", "IoAlmYsBwc");
        setField(term641, term641.getClass(), "opt", "TEParAifyi");
        setField(term641, term641.getClass(), "longOpt", "OWDIEULEFu");
        setField(term641, term641.getClass(), "argName", "dWRymuLBtr");
        setField(term641, term641.getClass(), "description", "AijpHYOFuy");
        setBooleanField(term641, term641.getClass(), "required", true);
        setBooleanField(term641, term641.getClass(), "optionalArg", false);
        setIntField(term641, term641.getClass(), "numberOfArgs", 1484323161);
        setField(term641, term641.getClass(), "type", null);
        setField(term641, term641.getClass(), "values", term693);
        setCharField(term641, term641.getClass(), "valuesep", 'E');
        setField(term596, term596.getClass(), "currentOption", term641);
        setBooleanField(term596, term596.getClass(), "skipParsing", true);
        setField(term596, term596.getClass(), "expectedOpts", term699);
        LinkedHashMap term704 = new LinkedHashMap();
        LinkedHashMap term710 = new LinkedHashMap();
        ArrayList term716 = new ArrayList();
        LinkedHashMap term720 = new LinkedHashMap();
        term703 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term703, term703.getClass(), "shortOpts", term704);
        setField(term703, term703.getClass(), "longOpts", term710);
        setField(term703, term703.getClass(), "requiredOpts", term716);
        setField(term703, term703.getClass(), "optionGroups", term720);
        term726 = (Object[]) newArray("java.lang.String", 9);
        setElement(term726, 0, "SbAoxhfrkn");
        setElement(term726, 1, "kuTXqwMtDB");
        setElement(term726, 2, "Ghbwtircqb");
        setElement(term726, 3, "xrwlQZdwCp");
        setElement(term726, 4, "IDCWpPLRkE");
        setElement(term726, 5, "nyiiPDVjAc");
        setElement(term726, 6, "aKnKipADSo");
        setElement(term726, 7, "wSQxaModmm");
        setElement(term726, 8, "UlajhuVLaP");
        term835 = new Boolean(false);
        LinkedList term6675 = new LinkedList();
        ((LinkedList) term6675).add("SbAoxhfrkn");
        ((LinkedList) term6675).add("");
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ((LinkedList) term6675).add((Object)null);
        ArrayList term6688 = new ArrayList();
        LinkedHashMap term6691 = new LinkedHashMap();
        LinkedHashMap term6692 = new LinkedHashMap();
        ArrayList term6693 = new ArrayList();
        LinkedHashMap term6695 = new LinkedHashMap();
        ArrayList term6699 = new ArrayList();
        term6673 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term6674 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term6690 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6674, term6674.getClass(), "args", term6675);
        setField(term6674, term6674.getClass(), "options", term6688);
        setField(term6673, term6673.getClass(), "cmd", term6674);
        setField(term6690, term6690.getClass(), "shortOpts", term6691);
        setField(term6690, term6690.getClass(), "longOpts", term6692);
        setField(term6690, term6690.getClass(), "requiredOpts", term6693);
        setField(term6690, term6690.getClass(), "optionGroups", term6695);
        setField(term6673, term6673.getClass(), "options", term6690);
        setBooleanField(term6673, term6673.getClass(), "stopAtNonOption", false);
        setField(term6673, term6673.getClass(), "currentToken", "UlajhuVLaP");
        setField(term6673, term6673.getClass(), "currentOption", null);
        setBooleanField(term6673, term6673.getClass(), "skipParsing", false);
        setField(term6673, term6673.getClass(), "expectedOpts", term6699);
        LinkedHashMap term6702 = new LinkedHashMap();
        LinkedHashMap term6703 = new LinkedHashMap();
        ArrayList term6704 = new ArrayList();
        LinkedHashMap term6706 = new LinkedHashMap();
        term6701 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6701, term6701.getClass(), "shortOpts", term6702);
        setField(term6701, term6701.getClass(), "longOpts", term6703);
        setField(term6701, term6701.getClass(), "requiredOpts", term6704);
        setField(term6701, term6701.getClass(), "optionGroups", term6706);
        term6708 = (Object[]) newArray("java.lang.String", 9);
        setElement(term6708, 0, "SbAoxhfrkn");
        setElement(term6708, 1, "kuTXqwMtDB");
        setElement(term6708, 2, "Ghbwtircqb");
        setElement(term6708, 3, "xrwlQZdwCp");
        setElement(term6708, 4, "IDCWpPLRkE");
        setElement(term6708, 5, "nyiiPDVjAc");
        setElement(term6708, 6, "aKnKipADSo");
        setElement(term6708, 7, "wSQxaModmm");
        setElement(term6708, 8, "UlajhuVLaP");
        LinkedList term6010 = new LinkedList();
        ((LinkedList) term6010).add("SbAoxhfrkn");
        ((LinkedList) term6010).add("");
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ((LinkedList) term6010).add((Object)null);
        ArrayList term6045 = new ArrayList();
        term6009 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term6009, term6009.getClass(), "args", term6010);
        setField(term6009, term6009.getClass(), "options", term6045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term703;
        args[1] = term726;
        args[2] = term835;
        Object retValue = callMethod(klass, "parse", argTypes, term596, args);
        assertTrue(recursiveEquals(term596, term6673));
        assertTrue(recursiveEquals(term703, term6701));
        assertTrue(recursiveEquals(term726, term6708));
        assertTrue(recursiveEquals(term835, false));
        assertTrue(recursiveEquals(retValue, term6009));
    }

};


