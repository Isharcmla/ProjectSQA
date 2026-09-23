package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104293;

    public DOMNodePointer_createAttribute_149645840316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104293 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104405 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104629 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term104965 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105077 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105189 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105637 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105861 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105973 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106085 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106197 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106309 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106533 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106645 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107093 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107317 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107541 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term107989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108101 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108325 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108437 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108885 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term108997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term109109 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term109221 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term109333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term104293, term104293.getClass(), "node", null);
        setField(term104293, term104293.getClass(), "id", null);
        setField(term104405, term104405.getClass(), "id", null);
        setField(term104517, term104517.getClass(), "id", null);
        setField(term104629, term104629.getClass(), "id", null);
        setField(term104741, term104741.getClass(), "id", null);
        setField(term104853, term104853.getClass(), "id", null);
        setField(term104965, term104965.getClass(), "id", null);
        setField(term105077, term105077.getClass(), "id", null);
        setField(term105189, term105189.getClass(), "id", null);
        setField(term105301, term105301.getClass(), "id", null);
        setField(term105413, term105413.getClass(), "id", null);
        setField(term105525, term105525.getClass(), "id", null);
        setField(term105637, term105637.getClass(), "id", null);
        setField(term105749, term105749.getClass(), "id", null);
        setField(term105861, term105861.getClass(), "id", null);
        setField(term105973, term105973.getClass(), "id", null);
        setField(term106085, term106085.getClass(), "id", null);
        setField(term106197, term106197.getClass(), "id", null);
        setField(term106309, term106309.getClass(), "id", null);
        setField(term106421, term106421.getClass(), "id", null);
        setField(term106533, term106533.getClass(), "id", null);
        setField(term106645, term106645.getClass(), "id", null);
        setField(term106757, term106757.getClass(), "id", null);
        setField(term106869, term106869.getClass(), "id", null);
        setField(term106981, term106981.getClass(), "id", null);
        setField(term107093, term107093.getClass(), "id", null);
        setField(term107205, term107205.getClass(), "id", null);
        setField(term107317, term107317.getClass(), "id", null);
        setField(term107429, term107429.getClass(), "id", null);
        setField(term107541, term107541.getClass(), "id", null);
        setField(term107653, term107653.getClass(), "id", null);
        setField(term107765, term107765.getClass(), "id", null);
        setField(term107877, term107877.getClass(), "id", null);
        setField(term107989, term107989.getClass(), "id", null);
        setField(term108101, term108101.getClass(), "id", null);
        setField(term108213, term108213.getClass(), "id", null);
        setField(term108325, term108325.getClass(), "id", null);
        setField(term108437, term108437.getClass(), "id", null);
        setField(term108549, term108549.getClass(), "id", null);
        setField(term108661, term108661.getClass(), "id", null);
        setField(term108773, term108773.getClass(), "id", null);
        setField(term108885, term108885.getClass(), "id", null);
        setField(term108997, term108997.getClass(), "id", null);
        setField(term109109, term109109.getClass(), "id", null);
        setField(term109221, term109221.getClass(), "id", null);
        setField(term109333, term109333.getClass(), "id", null);
        setField(term109333, term109333.getClass(), "parent", null);
        setField(term109221, term109221.getClass(), "parent", term109333);
        setField(term109109, term109109.getClass(), "parent", term109221);
        setField(term108997, term108997.getClass(), "parent", term109109);
        setField(term108885, term108885.getClass(), "parent", term108997);
        setField(term108773, term108773.getClass(), "parent", term108885);
        setField(term108661, term108661.getClass(), "parent", term108773);
        setField(term108549, term108549.getClass(), "parent", term108661);
        setField(term108437, term108437.getClass(), "parent", term108549);
        setField(term108325, term108325.getClass(), "parent", term108437);
        setField(term108213, term108213.getClass(), "parent", term108325);
        setField(term108101, term108101.getClass(), "parent", term108213);
        setField(term107989, term107989.getClass(), "parent", term108101);
        setField(term107877, term107877.getClass(), "parent", term107989);
        setField(term107765, term107765.getClass(), "parent", term107877);
        setField(term107653, term107653.getClass(), "parent", term107765);
        setField(term107541, term107541.getClass(), "parent", term107653);
        setField(term107429, term107429.getClass(), "parent", term107541);
        setField(term107317, term107317.getClass(), "parent", term107429);
        setField(term107205, term107205.getClass(), "parent", term107317);
        setField(term107093, term107093.getClass(), "parent", term107205);
        setField(term106981, term106981.getClass(), "parent", term107093);
        setField(term106869, term106869.getClass(), "parent", term106981);
        setField(term106757, term106757.getClass(), "parent", term106869);
        setField(term106645, term106645.getClass(), "parent", term106757);
        setField(term106533, term106533.getClass(), "parent", term106645);
        setField(term106421, term106421.getClass(), "parent", term106533);
        setField(term106309, term106309.getClass(), "parent", term106421);
        setField(term106197, term106197.getClass(), "parent", term106309);
        setField(term106085, term106085.getClass(), "parent", term106197);
        setField(term105973, term105973.getClass(), "parent", term106085);
        setField(term105861, term105861.getClass(), "parent", term105973);
        setField(term105749, term105749.getClass(), "parent", term105861);
        setField(term105637, term105637.getClass(), "parent", term105749);
        setField(term105525, term105525.getClass(), "parent", term105637);
        setField(term105413, term105413.getClass(), "parent", term105525);
        setField(term105301, term105301.getClass(), "parent", term105413);
        setField(term105189, term105189.getClass(), "parent", term105301);
        setField(term105077, term105077.getClass(), "parent", term105189);
        setField(term104965, term104965.getClass(), "parent", term105077);
        setField(term104853, term104853.getClass(), "parent", term104965);
        setField(term104741, term104741.getClass(), "parent", term104853);
        setField(term104629, term104629.getClass(), "parent", term104741);
        setField(term104517, term104517.getClass(), "parent", term104629);
        setField(term104405, term104405.getClass(), "parent", term104517);
        setField(term104293, term104293.getClass(), "parent", term104405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createAttribute", argTypes, term104293, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


