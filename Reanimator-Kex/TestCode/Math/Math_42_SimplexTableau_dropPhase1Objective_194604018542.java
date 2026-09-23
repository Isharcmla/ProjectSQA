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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_dropPhase1Objective_194604018542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3772;
     Object term33736;

    public SimplexTableau_dropPhase1Objective_194604018542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33758 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33757 = ((Class) term33758).getDeclaredField((String) "GEQ");
        ((Field) term33757).setAccessible(true);
        Object enum76 = ((Field) term33757).get((Object) null);
        Object term3777 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3777, term3777.getClass(), "coefficients", null);
        setField(term3777, term3777.getClass(), "relationship", enum76);
        setDoubleField(term3777, term3777.getClass(), "value", 0.6588948704887806);
        Object term3781 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3781, term3781.getClass(), "coefficients", null);
        setField(term3781, term3781.getClass(), "relationship", enum76);
        setDoubleField(term3781, term3781.getClass(), "value", 0.6397214730945112);
        Class<? extends Object> term34054 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34053 = ((Class) term34054).getDeclaredField((String) "EQ");
        ((Field) term34053).setAccessible(true);
        Object enum77 = ((Field) term34053).get((Object) null);
        Object term3783 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3783, term3783.getClass(), "coefficients", null);
        setField(term3783, term3783.getClass(), "relationship", enum77);
        setDoubleField(term3783, term3783.getClass(), "value", 0.25937345430928016);
        Class<? extends Object> term34347 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34346 = ((Class) term34347).getDeclaredField((String) "GEQ");
        ((Field) term34346).setAccessible(true);
        Object enum78 = ((Field) term34346).get((Object) null);
        Object term3787 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3787, term3787.getClass(), "coefficients", null);
        setField(term3787, term3787.getClass(), "relationship", enum78);
        setDoubleField(term3787, term3787.getClass(), "value", 0.5873228247510078);
        Object term3791 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3791, term3791.getClass(), "coefficients", null);
        setField(term3791, term3791.getClass(), "relationship", enum78);
        setDoubleField(term3791, term3791.getClass(), "value", 0.8823181080774973);
        ArrayList term3775 = new ArrayList();
        ((ArrayList) term3775).add(term3777);
        ((ArrayList) term3775).add(term3781);
        ((ArrayList) term3775).add(term3783);
        ((ArrayList) term3775).add(term3787);
        ((ArrayList) term3775).add(term3791);
        ArrayList term3796 = new ArrayList();
        ((ArrayList) term3796).add("RkybSrpybU");
        ((ArrayList) term3796).add("xOEqzGAmDU");
        ((ArrayList) term3796).add("eZFUvlxvGV");
        ((ArrayList) term3796).add("BYqFIqCKAV");
        term3772 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term3773 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term3773, term3773.getClass(), "coefficients", null);
        setDoubleField(term3773, term3773.getClass(), "constantTerm", 0.8878841294187743);
        setField(term3772, term3772.getClass(), "f", term3773);
        setField(term3772, term3772.getClass(), "constraints", term3775);
        setBooleanField(term3772, term3772.getClass(), "restrictToNonNegative", false);
        setField(term3772, term3772.getClass(), "columnLabels", term3796);
        setField(term3772, term3772.getClass(), "tableau", null);
        setIntField(term3772, term3772.getClass(), "numDecisionVariables", -244121226);
        setIntField(term3772, term3772.getClass(), "numSlackVariables", -203030934);
        setIntField(term3772, term3772.getClass(), "numArtificialVariables", -1179120542);
        setDoubleField(term3772, term3772.getClass(), "epsilon", 0.2192450926212024);
        setIntField(term3772, term3772.getClass(), "maxUlps", -73683645);
        Class<? extends Object> term34683 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34682 = ((Class) term34683).getDeclaredField((String) "GEQ");
        ((Field) term34682).setAccessible(true);
        Object enum79 = ((Field) term34682).get((Object) null);
        Object term33740 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33740, term33740.getClass(), "coefficients", null);
        setField(term33740, term33740.getClass(), "relationship", enum79);
        setDoubleField(term33740, term33740.getClass(), "value", 0.6588948704887806);
        Object term33742 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33742, term33742.getClass(), "coefficients", null);
        setField(term33742, term33742.getClass(), "relationship", enum79);
        setDoubleField(term33742, term33742.getClass(), "value", 0.6397214730945112);
        Class<? extends Object> term34979 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term34978 = ((Class) term34979).getDeclaredField((String) "GEQ");
        ((Field) term34978).setAccessible(true);
        Object enum80 = ((Field) term34978).get((Object) null);
        Object term33743 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33743, term33743.getClass(), "coefficients", null);
        setField(term33743, term33743.getClass(), "relationship", enum80);
        setDoubleField(term33743, term33743.getClass(), "value", 0.25937345430928016);
        Object term33745 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33745, term33745.getClass(), "coefficients", null);
        setField(term33745, term33745.getClass(), "relationship", enum80);
        setDoubleField(term33745, term33745.getClass(), "value", 0.5873228247510078);
        Object term33746 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term33746, term33746.getClass(), "coefficients", null);
        setField(term33746, term33746.getClass(), "relationship", enum80);
        setDoubleField(term33746, term33746.getClass(), "value", 0.8823181080774973);
        ArrayList term33738 = new ArrayList();
        ((ArrayList) term33738).add(term33740);
        ((ArrayList) term33738).add(term33742);
        ((ArrayList) term33738).add(term33743);
        ((ArrayList) term33738).add(term33745);
        ((ArrayList) term33738).add(term33746);
        ArrayList term33747 = new ArrayList();
        ((ArrayList) term33747).add("RkybSrpybU");
        ((ArrayList) term33747).add("xOEqzGAmDU");
        ((ArrayList) term33747).add("eZFUvlxvGV");
        ((ArrayList) term33747).add("BYqFIqCKAV");
        term33736 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33737 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term33737, term33737.getClass(), "coefficients", null);
        setDoubleField(term33737, term33737.getClass(), "constantTerm", 0.8878841294187743);
        setField(term33736, term33736.getClass(), "f", term33737);
        setField(term33736, term33736.getClass(), "constraints", term33738);
        setBooleanField(term33736, term33736.getClass(), "restrictToNonNegative", false);
        setField(term33736, term33736.getClass(), "columnLabels", term33747);
        setField(term33736, term33736.getClass(), "tableau", null);
        setIntField(term33736, term33736.getClass(), "numDecisionVariables", -244121226);
        setIntField(term33736, term33736.getClass(), "numSlackVariables", -203030934);
        setIntField(term33736, term33736.getClass(), "numArtificialVariables", -1179120542);
        setDoubleField(term33736, term33736.getClass(), "epsilon", 0.2192450926212024);
        setIntField(term33736, term33736.getClass(), "maxUlps", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dropPhase1Objective", argTypes, term3772, args);
        assertTrue(recursiveEquals(term3772, term33736));
    }

};


