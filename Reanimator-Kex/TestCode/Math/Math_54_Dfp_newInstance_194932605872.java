package org.apache.commons.math.dfp;

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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Dfp_newInstance_194932605872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5707;
     Object term5795;

    public Dfp_newInstance_194932605872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80624 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term80623 = ((Class) term80624).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term80623).setAccessible(true);
        Object enum168 = ((Field) term80623).get((Object) null);
        Class<? extends Object> term80906 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term80905 = ((Class) term80906).getDeclaredField((String) "ROUND_UP");
        ((Field) term80905).setAccessible(true);
        Object enum169 = ((Field) term80905).get((Object) null);
        term5707 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term5708 = (int[]) newIntArray(9);
        Object term5721 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term5723 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term5724 = (int[]) newIntArray(7);
        Object term5735 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term5737 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5741 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5745 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5749 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term5750 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5754 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5758 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term5759 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term5760 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5764 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term5765 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term5769 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 9);
        Object term5770 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5774 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5778 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object[] term5779 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 6);
        Object[] term5780 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term5781 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        setIntElement(term5708, 0, 1507074215);
        setIntElement(term5708, 1, -282881827);
        setIntElement(term5708, 2, -1183353915);
        setIntElement(term5708, 3, -420030135);
        setIntElement(term5708, 4, 267763294);
        setIntElement(term5708, 5, -1497710478);
        setIntElement(term5708, 6, 49950830);
        setIntElement(term5708, 7, -525257914);
        setIntElement(term5708, 8, 147209682);
        setField(term5707, term5707.getClass(), "mant", term5708);
        setByteField(term5707, term5707.getClass(), "sign", (byte) -74);
        setIntField(term5707, term5707.getClass(), "exp", 34470066);
        setByteField(term5707, term5707.getClass(), "nans", (byte) -84);
        setIntField(term5721, term5721.getClass(), "radixDigits", 2058711405);
        setIntElement(term5724, 0, 1743683601);
        setIntElement(term5724, 1, -945116798);
        setIntElement(term5724, 2, 1593461795);
        setIntElement(term5724, 3, 515182546);
        setIntElement(term5724, 4, -936895502);
        setIntElement(term5724, 5, -129547140);
        setIntElement(term5724, 6, 199287428);
        setField(term5723, term5723.getClass(), "mant", term5724);
        setByteField(term5723, term5723.getClass(), "sign", (byte) -93);
        setIntField(term5723, term5723.getClass(), "exp", -1195339592);
        setByteField(term5723, term5723.getClass(), "nans", (byte) 82);
        setIntField(term5735, term5735.getClass(), "radixDigits", -376422566);
        setField(term5737, term5737.getClass(), "mant", null);
        setByteField(term5737, term5737.getClass(), "sign", (byte) 24);
        setIntField(term5737, term5737.getClass(), "exp", 306847454);
        setByteField(term5737, term5737.getClass(), "nans", (byte) 123);
        setField(term5737, term5737.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "zero", term5737);
        setField(term5735, term5735.getClass(), "one", term5737);
        setField(term5741, term5741.getClass(), "mant", null);
        setByteField(term5741, term5741.getClass(), "sign", (byte) 0);
        setIntField(term5741, term5741.getClass(), "exp", 0);
        setByteField(term5741, term5741.getClass(), "nans", (byte) 0);
        setField(term5741, term5741.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "two", term5741);
        setField(term5745, term5745.getClass(), "mant", null);
        setByteField(term5745, term5745.getClass(), "sign", (byte) 0);
        setIntField(term5745, term5745.getClass(), "exp", 0);
        setByteField(term5745, term5745.getClass(), "nans", (byte) 0);
        setField(term5745, term5745.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "sqr2", term5745);
        setElement(term5749, 0, term5723);
        setField(term5735, term5735.getClass(), "sqr2Split", term5749);
        setField(term5735, term5735.getClass(), "sqr2Reciprocal", term5745);
        setField(term5735, term5735.getClass(), "sqr3", term5745);
        setField(term5750, term5750.getClass(), "mant", null);
        setByteField(term5750, term5750.getClass(), "sign", (byte) 0);
        setIntField(term5750, term5750.getClass(), "exp", 0);
        setByteField(term5750, term5750.getClass(), "nans", (byte) 0);
        setField(term5750, term5750.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "sqr3Reciprocal", term5750);
        setField(term5754, term5754.getClass(), "mant", null);
        setByteField(term5754, term5754.getClass(), "sign", (byte) 0);
        setIntField(term5754, term5754.getClass(), "exp", 0);
        setByteField(term5754, term5754.getClass(), "nans", (byte) 0);
        setField(term5754, term5754.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "pi", term5754);
        setElement(term5758, 0, term5723);
        setElement(term5758, 1, term5741);
        setElement(term5758, 2, term5745);
        setElement(term5758, 4, term5750);
        setElement(term5758, 5, term5723);
        setElement(term5758, 6, term5754);
        setElement(term5758, 7, term5745);
        setField(term5735, term5735.getClass(), "piSplit", term5758);
        setField(term5735, term5735.getClass(), "e", term5723);
        setElement(term5759, 2, term5737);
        setElement(term5759, 3, term5723);
        setElement(term5759, 5, term5741);
        setElement(term5759, 6, term5707);
        setElement(term5759, 7, term5750);
        setField(term5735, term5735.getClass(), "eSplit", term5759);
        setField(term5760, term5760.getClass(), "mant", null);
        setByteField(term5760, term5760.getClass(), "sign", (byte) 0);
        setIntField(term5760, term5760.getClass(), "exp", 0);
        setByteField(term5760, term5760.getClass(), "nans", (byte) 0);
        setField(term5760, term5760.getClass(), "field", null);
        setField(term5735, term5735.getClass(), "ln2", term5760);
        setElement(term5764, 0, term5754);
        setElement(term5764, 1, term5760);
        setElement(term5764, 2, term5760);
        setElement(term5764, 4, term5737);
        setField(term5735, term5735.getClass(), "ln2Split", term5764);
        setField(term5735, term5735.getClass(), "ln5", term5745);
        setElement(term5765, 0, term5741);
        setElement(term5765, 2, term5723);
        setElement(term5765, 3, term5760);
        setElement(term5765, 4, term5723);
        setElement(term5765, 6, term5754);
        setField(term5735, term5735.getClass(), "ln5Split", term5765);
        setField(term5735, term5735.getClass(), "ln10", term5754);
        setField(term5735, term5735.getClass(), "rMode", enum168);
        setIntField(term5735, term5735.getClass(), "ieeeFlags", 2049577015);
        setField(term5723, term5723.getClass(), "field", term5735);
        setField(term5721, term5721.getClass(), "zero", term5723);
        setField(term5721, term5721.getClass(), "one", term5741);
        setField(term5721, term5721.getClass(), "two", term5741);
        setField(term5721, term5721.getClass(), "sqr2", term5750);
        setElement(term5769, 0, term5707);
        setElement(term5769, 1, term5707);
        setElement(term5769, 2, term5737);
        setElement(term5769, 3, term5723);
        setElement(term5769, 4, term5741);
        setElement(term5769, 5, term5723);
        setElement(term5769, 6, term5745);
        setElement(term5769, 7, term5750);
        setElement(term5769, 8, term5745);
        setField(term5721, term5721.getClass(), "sqr2Split", term5769);
        setField(term5770, term5770.getClass(), "mant", null);
        setByteField(term5770, term5770.getClass(), "sign", (byte) 0);
        setIntField(term5770, term5770.getClass(), "exp", 0);
        setByteField(term5770, term5770.getClass(), "nans", (byte) 0);
        setField(term5770, term5770.getClass(), "field", null);
        setField(term5721, term5721.getClass(), "sqr2Reciprocal", term5770);
        setField(term5721, term5721.getClass(), "sqr3", term5750);
        setField(term5774, term5774.getClass(), "mant", null);
        setByteField(term5774, term5774.getClass(), "sign", (byte) 0);
        setIntField(term5774, term5774.getClass(), "exp", 0);
        setByteField(term5774, term5774.getClass(), "nans", (byte) 0);
        setField(term5774, term5774.getClass(), "field", null);
        setField(term5721, term5721.getClass(), "sqr3Reciprocal", term5774);
        setField(term5721, term5721.getClass(), "pi", term5770);
        setElement(term5778, 0, term5774);
        setElement(term5778, 1, term5754);
        setElement(term5778, 2, term5774);
        setElement(term5778, 3, term5770);
        setElement(term5778, 4, term5737);
        setElement(term5778, 5, term5760);
        setElement(term5778, 6, term5741);
        setField(term5721, term5721.getClass(), "piSplit", term5778);
        setField(term5721, term5721.getClass(), "e", term5723);
        setElement(term5779, 0, term5754);
        setElement(term5779, 1, term5741);
        setElement(term5779, 2, term5737);
        setElement(term5779, 3, term5754);
        setElement(term5779, 4, term5774);
        setElement(term5779, 5, term5745);
        setField(term5721, term5721.getClass(), "eSplit", term5779);
        setField(term5721, term5721.getClass(), "ln2", term5774);
        setElement(term5780, 0, term5750);
        setElement(term5780, 1, term5760);
        setElement(term5780, 2, term5723);
        setElement(term5780, 3, term5770);
        setElement(term5780, 4, term5707);
        setField(term5721, term5721.getClass(), "ln2Split", term5780);
        setField(term5721, term5721.getClass(), "ln5", term5760);
        setElement(term5781, 0, term5745);
        setElement(term5781, 1, term5745);
        setField(term5721, term5721.getClass(), "ln5Split", term5781);
        setField(term5721, term5721.getClass(), "ln10", term5707);
        setField(term5721, term5721.getClass(), "rMode", enum169);
        setIntField(term5721, term5721.getClass(), "ieeeFlags", 1236004505);
        setField(term5707, term5707.getClass(), "field", term5721);
        term5795 = new Integer(1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5795;
        try {
            callMethod(klass, "newInstance", argTypes, term5707, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


