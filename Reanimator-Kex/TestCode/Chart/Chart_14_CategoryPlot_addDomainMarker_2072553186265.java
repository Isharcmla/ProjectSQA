package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class CategoryPlot_addDomainMarker_2072553186265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2756;
     Object term2758;
     Object term2803;
     Object term2816;

    public CategoryPlot_addDomainMarker_2072553186265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2756 = new Integer(1876565163);
        term2758 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term2773 = newInstance(Class.forName("java.awt.Font"));
        Object term2774 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2775 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2776 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term2758, term2758.getClass(), "key", null);
        setBooleanField(term2758, term2758.getClass(), "drawAsLine", false);
        setField(term2758, term2758.getClass(), "paint", null);
        setField(term2758, term2758.getClass(), "stroke", null);
        setField(term2758, term2758.getClass(), "outlinePaint", null);
        setField(term2758, term2758.getClass(), "outlineStroke", null);
        setFloatField(term2758, term2758.getClass(), "alpha", 0.89057696F);
        setField(term2758, term2758.getClass(), "label", "YRHGsAkhxb");
        setIntField(term2776, term2776.getClass(), "hash", 2084081779);
        setField(term2776, term2776.getClass(), "key", null);
        setField(term2776, term2776.getClass(), "value", null);
        setField(term2776, term2776.getClass(), "next", null);
        setElement(term2775, 10, term2776);
        setField(term2774, term2774.getClass(), "table", term2775);
        setIntField(term2774, term2774.getClass(), "count", 1);
        setIntField(term2774, term2774.getClass(), "threshold", 8);
        setFloatField(term2774, term2774.getClass(), "loadFactor", 0.75F);
        setIntField(term2774, term2774.getClass(), "modCount", 1);
        setField(term2774, term2774.getClass(), "keySet", null);
        setField(term2774, term2774.getClass(), "entrySet", null);
        setField(term2774, term2774.getClass(), "values", null);
        setField(term2773, term2773.getClass(), "fRequestedAttributes", term2774);
        setField(term2773, term2773.getClass(), "name", "ffYhPOzlUs");
        setIntField(term2773, term2773.getClass(), "style", 579005622);
        setIntField(term2773, term2773.getClass(), "size", -14890619);
        setFloatField(term2773, term2773.getClass(), "pointSize", 0.7332741F);
        setField(term2773, term2773.getClass(), "peer", null);
        setLongField(term2773, term2773.getClass(), "pData", 0L);
        setField(term2773, term2773.getClass(), "font2DHandle", null);
        setField(term2773, term2773.getClass(), "values", null);
        setBooleanField(term2773, term2773.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2773, term2773.getClass(), "createdFont", false);
        setBooleanField(term2773, term2773.getClass(), "nonIdentityTx", false);
        setIntField(term2773, term2773.getClass(), "hash", 0);
        setIntField(term2773, term2773.getClass(), "fontSerializedDataVersion", 0);
        setField(term2773, term2773.getClass(), "flmref", null);
        setField(term2758, term2758.getClass(), "labelFont", term2773);
        setField(term2758, term2758.getClass(), "labelPaint", null);
        setField(term2758, term2758.getClass(), "labelAnchor", null);
        setField(term2758, term2758.getClass(), "labelTextAnchor", null);
        setField(term2758, term2758.getClass(), "labelOffset", null);
        setField(term2758, term2758.getClass(), "labelOffsetType", null);
        setField(term2758, term2758.getClass(), "listenerList", null);
        term2803 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term2803, term2803.getClass(), "name", "MLqYREekMl");
        term2816 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.CategoryMarker");
        argTypes[2] = Class.forName("org.jfree.chart.util.Layer");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term2756;
        args[1] = term2758;
        args[2] = term2803;
        args[3] = term2816;
        try {
            callMethod(klass, "addDomainMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


