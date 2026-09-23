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

public class CategoryPlot_addDomainMarker_1461905332249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2666;
     Object term2668;
     Object term2713;

    public CategoryPlot_addDomainMarker_1461905332249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2666 = new Integer(-1145578966);
        term2668 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term2683 = newInstance(Class.forName("java.awt.Font"));
        Object term2684 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2685 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2686 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term2668, term2668.getClass(), "key", null);
        setBooleanField(term2668, term2668.getClass(), "drawAsLine", false);
        setField(term2668, term2668.getClass(), "paint", null);
        setField(term2668, term2668.getClass(), "stroke", null);
        setField(term2668, term2668.getClass(), "outlinePaint", null);
        setField(term2668, term2668.getClass(), "outlineStroke", null);
        setFloatField(term2668, term2668.getClass(), "alpha", 0.7467328F);
        setField(term2668, term2668.getClass(), "label", "UoYtihxVaS");
        setIntField(term2686, term2686.getClass(), "hash", 2042513472);
        setField(term2686, term2686.getClass(), "key", null);
        setField(term2686, term2686.getClass(), "value", null);
        setField(term2686, term2686.getClass(), "next", null);
        setElement(term2685, 10, term2686);
        setField(term2684, term2684.getClass(), "table", term2685);
        setIntField(term2684, term2684.getClass(), "count", 1);
        setIntField(term2684, term2684.getClass(), "threshold", 8);
        setFloatField(term2684, term2684.getClass(), "loadFactor", 0.75F);
        setIntField(term2684, term2684.getClass(), "modCount", 1);
        setField(term2684, term2684.getClass(), "keySet", null);
        setField(term2684, term2684.getClass(), "entrySet", null);
        setField(term2684, term2684.getClass(), "values", null);
        setField(term2683, term2683.getClass(), "fRequestedAttributes", term2684);
        setField(term2683, term2683.getClass(), "name", "JDswTTCZHV");
        setIntField(term2683, term2683.getClass(), "style", -602026508);
        setIntField(term2683, term2683.getClass(), "size", -157887805);
        setFloatField(term2683, term2683.getClass(), "pointSize", 0.6436713F);
        setField(term2683, term2683.getClass(), "peer", null);
        setLongField(term2683, term2683.getClass(), "pData", 0L);
        setField(term2683, term2683.getClass(), "font2DHandle", null);
        setField(term2683, term2683.getClass(), "values", null);
        setBooleanField(term2683, term2683.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2683, term2683.getClass(), "createdFont", false);
        setBooleanField(term2683, term2683.getClass(), "nonIdentityTx", false);
        setIntField(term2683, term2683.getClass(), "hash", 0);
        setIntField(term2683, term2683.getClass(), "fontSerializedDataVersion", 0);
        setField(term2683, term2683.getClass(), "flmref", null);
        setField(term2668, term2668.getClass(), "labelFont", term2683);
        setField(term2668, term2668.getClass(), "labelPaint", null);
        setField(term2668, term2668.getClass(), "labelAnchor", null);
        setField(term2668, term2668.getClass(), "labelTextAnchor", null);
        setField(term2668, term2668.getClass(), "labelOffset", null);
        setField(term2668, term2668.getClass(), "labelOffsetType", null);
        setField(term2668, term2668.getClass(), "listenerList", null);
        term2713 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term2713, term2713.getClass(), "name", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.plot.CategoryMarker");
        argTypes[2] = Class.forName("org.jfree.chart.util.Layer");
        Object[] args = new Object[3];
        args[0] = term2666;
        args[1] = term2668;
        args[2] = term2713;
        try {
            callMethod(klass, "addDomainMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


