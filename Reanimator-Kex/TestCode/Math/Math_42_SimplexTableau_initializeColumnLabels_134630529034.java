package org.apache.commons.math.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_initializeColumnLabels_134630529034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public SimplexTableau_initializeColumnLabels_134630529034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25562 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term25561 = ((Class) term25562).getDeclaredField((String) "GEQ");
        ((Field) term25561).setAccessible(true);
        Object enum56 = ((Field) term25561).get((Object) null);
        Object term16 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term16, term16.getClass(), "coefficients", null);
        setField(term16, term16.getClass(), "relationship", enum56);
        setDoubleField(term16, term16.getClass(), "value", 0.544608645520025);
        Class<? extends Object> term25858 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term25857 = ((Class) term25858).getDeclaredField((String) "LEQ");
        ((Field) term25857).setAccessible(true);
        Object enum57 = ((Field) term25857).get((Object) null);
        Object term20 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term20, term20.getClass(), "coefficients", null);
        setField(term20, term20.getClass(), "relationship", enum57);
        setDoubleField(term20, term20.getClass(), "value", 0.28570734989730284);
        Object term24 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term24, term24.getClass(), "coefficients", null);
        setField(term24, term24.getClass(), "relationship", enum56);
        setDoubleField(term24, term24.getClass(), "value", 0.40176586625454525);
        Object term26 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term26, term26.getClass(), "coefficients", null);
        setField(term26, term26.getClass(), "relationship", enum57);
        setDoubleField(term26, term26.getClass(), "value", 0.2641345529914265);
        Class<? extends Object> term26154 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term26153 = ((Class) term26154).getDeclaredField((String) "LEQ");
        ((Field) term26153).setAccessible(true);
        Object enum58 = ((Field) term26153).get((Object) null);
        Object term28 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28, term28.getClass(), "coefficients", null);
        setField(term28, term28.getClass(), "relationship", enum58);
        setDoubleField(term28, term28.getClass(), "value", 0.36923381893433327);
        ArrayList term14 = new ArrayList();
        ((ArrayList) term14).add(term16);
        ((ArrayList) term14).add(term20);
        ((ArrayList) term14).add(term24);
        ((ArrayList) term14).add(term26);
        ((ArrayList) term14).add(term28);
        ArrayList term35 = new ArrayList();
        ((ArrayList) term35).add("PAEBtnZtTD");
        ((ArrayList) term35).add("sjlJAEtRrb");
        ((ArrayList) term35).add("MuLcgQHgqz");
        ((ArrayList) term35).add("xxtlPwDYFs");
        term11 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term12 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term12, term12.getClass(), "coefficients", null);
        setDoubleField(term12, term12.getClass(), "constantTerm", 0.5523635872663106);
        setField(term11, term11.getClass(), "f", term12);
        setField(term11, term11.getClass(), "constraints", term14);
        setBooleanField(term11, term11.getClass(), "restrictToNonNegative", false);
        setField(term11, term11.getClass(), "columnLabels", term35);
        setField(term11, term11.getClass(), "tableau", null);
        setIntField(term11, term11.getClass(), "numDecisionVariables", 568599855);
        setIntField(term11, term11.getClass(), "numSlackVariables", 1162663216);
        setIntField(term11, term11.getClass(), "numArtificialVariables", 1484323161);
        setDoubleField(term11, term11.getClass(), "epsilon", 0.6076495596892013);
        setIntField(term11, term11.getClass(), "maxUlps", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeColumnLabels", argTypes, term11, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


