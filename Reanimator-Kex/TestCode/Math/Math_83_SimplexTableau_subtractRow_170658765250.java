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
import java.lang.Integer;
import java.lang.Double;

public class SimplexTableau_subtractRow_170658765250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7752;
     Object term7784;
     Object term7786;
     Object term7788;

    public SimplexTableau_subtractRow_170658765250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44713 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term44712 = ((Class) term44713).getDeclaredField((String) "LEQ");
        ((Field) term44712).setAccessible(true);
        Object enum109 = ((Field) term44712).get((Object) null);
        Object term7757 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7757, term7757.getClass(), "coefficients", null);
        setField(term7757, term7757.getClass(), "relationship", enum109);
        setDoubleField(term7757, term7757.getClass(), "value", 0.1544348383112728);
        Object term7761 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7761, term7761.getClass(), "coefficients", null);
        setField(term7761, term7761.getClass(), "relationship", enum109);
        setDoubleField(term7761, term7761.getClass(), "value", 0.5187846213101265);
        Class<? extends Object> term45009 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45008 = ((Class) term45009).getDeclaredField((String) "LEQ");
        ((Field) term45008).setAccessible(true);
        Object enum110 = ((Field) term45008).get((Object) null);
        Object term7763 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7763, term7763.getClass(), "coefficients", null);
        setField(term7763, term7763.getClass(), "relationship", enum110);
        setDoubleField(term7763, term7763.getClass(), "value", 0.045893173090043815);
        Class<? extends Object> term45305 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term45304 = ((Class) term45305).getDeclaredField((String) "LEQ");
        ((Field) term45304).setAccessible(true);
        Object enum111 = ((Field) term45304).get((Object) null);
        Object term7767 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7767, term7767.getClass(), "coefficients", null);
        setField(term7767, term7767.getClass(), "relationship", enum111);
        setDoubleField(term7767, term7767.getClass(), "value", 0.3626177854778667);
        Object term7771 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7771, term7771.getClass(), "coefficients", null);
        setField(term7771, term7771.getClass(), "relationship", enum109);
        setDoubleField(term7771, term7771.getClass(), "value", 0.3163771663728089);
        Object term7773 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7773, term7773.getClass(), "coefficients", null);
        setField(term7773, term7773.getClass(), "relationship", enum110);
        setDoubleField(term7773, term7773.getClass(), "value", 0.8819646072665548);
        Object term7775 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term7775, term7775.getClass(), "coefficients", null);
        setField(term7775, term7775.getClass(), "relationship", enum111);
        setDoubleField(term7775, term7775.getClass(), "value", 0.5412182593116958);
        ArrayList term7755 = new ArrayList();
        ((ArrayList) term7755).add(term7757);
        ((ArrayList) term7755).add(term7761);
        ((ArrayList) term7755).add(term7763);
        ((ArrayList) term7755).add(term7767);
        ((ArrayList) term7755).add(term7771);
        ((ArrayList) term7755).add(term7773);
        ((ArrayList) term7755).add(term7775);
        term7752 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term7753 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term7753, term7753.getClass(), "coefficients", null);
        setDoubleField(term7753, term7753.getClass(), "constantTerm", 0.24259014218848696);
        setField(term7752, term7752.getClass(), "f", term7753);
        setField(term7752, term7752.getClass(), "constraints", term7755);
        setBooleanField(term7752, term7752.getClass(), "restrictToNonNegative", true);
        setField(term7752, term7752.getClass(), "tableau", null);
        setIntField(term7752, term7752.getClass(), "numDecisionVariables", 1876565163);
        setIntField(term7752, term7752.getClass(), "numSlackVariables", -817164822);
        setIntField(term7752, term7752.getClass(), "numArtificialVariables", -1016503459);
        setDoubleField(term7752, term7752.getClass(), "epsilon", 0.16988691727397487);
        term7784 = new Integer(-1968847291);
        term7786 = new Integer(579005622);
        term7788 = new Double(0.39286935532362843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term7784;
        args[1] = term7786;
        args[2] = term7788;
        try {
            callMethod(klass, "subtractRow", argTypes, term7752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


