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
import java.util.HashMap;
import java.lang.Boolean;

public class CategoryPlot_setDomainAxis_1866191684185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;
     Object term846;
     Object term1039;

    public CategoryPlot_setDomainAxis_1866191684185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = new Integer(1484323161);
        HashMap term888 = new HashMap();
        HashMap term893 = new HashMap();
        HashMap term898 = new HashMap();
        term846 = newInstance(Class.forName("org.jfree.chart.axis.CategoryAxis"));
        Object term853 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPositions"));
        Object term854 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term855 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term857 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term859 = newInstance(Class.forName("org.jfree.chart.text.TextAnchor"));
        Object term862 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term865 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term866 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term868 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term872 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term873 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term875 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term878 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelWidthType"));
        Object term881 = newInstance(Class.forName("org.jfree.chart.axis.CategoryLabelPosition"));
        Object term882 = newInstance(Class.forName("org.jfree.chart.util.RectangleAnchor"));
        Object term884 = newInstance(Class.forName("org.jfree.chart.text.TextBlockAnchor"));
        Object term916 = newInstance(Class.forName("java.awt.Font"));
        Object term937 = newInstance(Class.forName("java.awt.Color"));
        Object term940 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term941 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term991 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term997 = newInstance(Class.forName("java.awt.Color"));
        Object term1001 = newInstance(Class.forName("java.awt.Font"));
        Object term1022 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1030 = newInstance(Class.forName("java.awt.BasicStroke"));
        Object term1037 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1038 = (Object[]) newArray("java.lang.Object", 0);
        setDoubleField(term846, term846.getClass(), "lowerMargin", 0.05);
        setDoubleField(term846, term846.getClass(), "upperMargin", 0.05);
        setDoubleField(term846, term846.getClass(), "categoryMargin", 0.2);
        setIntField(term846, term846.getClass(), "maximumCategoryLabelLines", 1);
        setFloatField(term846, term846.getClass(), "maximumCategoryLabelWidthRatio", 0.6880585F);
        setIntField(term846, term846.getClass(), "categoryLabelPositionOffset", 4);
        setField(term855, term855.getClass(), "name", "");
        setField(term854, term854.getClass(), "categoryAnchor", term855);
        setField(term857, term857.getClass(), "name", "");
        setField(term854, term854.getClass(), "labelAnchor", term857);
        setField(term859, term859.getClass(), "name", "");
        setField(term854, term854.getClass(), "rotationAnchor", term859);
        setDoubleField(term854, term854.getClass(), "angle", 0.0);
        setField(term862, term862.getClass(), "name", "");
        setField(term854, term854.getClass(), "widthType", term862);
        setFloatField(term854, term854.getClass(), "widthRatio", 0.95F);
        setField(term853, term853.getClass(), "positionForAxisAtTop", term854);
        setField(term866, term866.getClass(), "name", "");
        setField(term865, term865.getClass(), "categoryAnchor", term866);
        setField(term868, term868.getClass(), "name", "");
        setField(term865, term865.getClass(), "labelAnchor", term868);
        setField(term865, term865.getClass(), "rotationAnchor", term859);
        setDoubleField(term865, term865.getClass(), "angle", 0.0);
        setField(term865, term865.getClass(), "widthType", term862);
        setFloatField(term865, term865.getClass(), "widthRatio", 0.95F);
        setField(term853, term853.getClass(), "positionForAxisAtBottom", term865);
        setField(term873, term873.getClass(), "name", "");
        setField(term872, term872.getClass(), "categoryAnchor", term873);
        setField(term875, term875.getClass(), "name", "");
        setField(term872, term872.getClass(), "labelAnchor", term875);
        setField(term872, term872.getClass(), "rotationAnchor", term859);
        setDoubleField(term872, term872.getClass(), "angle", 0.0);
        setField(term878, term878.getClass(), "name", "");
        setField(term872, term872.getClass(), "widthType", term878);
        setFloatField(term872, term872.getClass(), "widthRatio", 0.3F);
        setField(term853, term853.getClass(), "positionForAxisAtLeft", term872);
        setField(term882, term882.getClass(), "name", "");
        setField(term881, term881.getClass(), "categoryAnchor", term882);
        setField(term884, term884.getClass(), "name", "");
        setField(term881, term881.getClass(), "labelAnchor", term884);
        setField(term881, term881.getClass(), "rotationAnchor", term859);
        setDoubleField(term881, term881.getClass(), "angle", 0.0);
        setField(term881, term881.getClass(), "widthType", term878);
        setFloatField(term881, term881.getClass(), "widthRatio", 0.3F);
        setField(term853, term853.getClass(), "positionForAxisAtRight", term881);
        setField(term846, term846.getClass(), "categoryLabelPositions", term853);
        setField(term846, term846.getClass(), "tickLabelFontMap", term888);
        setField(term846, term846.getClass(), "tickLabelPaintMap", term893);
        setField(term846, term846.getClass(), "categoryLabelToolTips", term898);
        setBooleanField(term846, term846.getClass(), "visible", true);
        setField(term846, term846.getClass(), "label", "NRdvgJlhkX");
        setField(term916, term916.getClass(), "fRequestedAttributes", null);
        setField(term916, term916.getClass(), "name", "SansSerif");
        setIntField(term916, term916.getClass(), "style", 0);
        setIntField(term916, term916.getClass(), "size", 12);
        setFloatField(term916, term916.getClass(), "pointSize", 12.0F);
        setField(term916, term916.getClass(), "peer", null);
        setLongField(term916, term916.getClass(), "pData", 0L);
        setField(term916, term916.getClass(), "font2DHandle", null);
        setField(term916, term916.getClass(), "values", null);
        setBooleanField(term916, term916.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term916, term916.getClass(), "createdFont", false);
        setBooleanField(term916, term916.getClass(), "nonIdentityTx", false);
        setIntField(term916, term916.getClass(), "hash", 0);
        setIntField(term916, term916.getClass(), "fontSerializedDataVersion", 1);
        setField(term916, term916.getClass(), "flmref", null);
        setField(term846, term846.getClass(), "labelFont", term916);
        setIntField(term937, term937.getClass(), "value", -16777216);
        setField(term937, term937.getClass(), "frgbvalue", null);
        setField(term937, term937.getClass(), "fvalue", null);
        setFloatField(term937, term937.getClass(), "falpha", 0.0F);
        setField(term937, term937.getClass(), "cs", null);
        setField(term846, term846.getClass(), "labelPaint", term937);
        setField(term941, term941.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term940, term940.getClass(), "unitType", term941);
        setDoubleField(term940, term940.getClass(), "top", 3.0);
        setDoubleField(term940, term940.getClass(), "left", 3.0);
        setDoubleField(term940, term940.getClass(), "bottom", 3.0);
        setDoubleField(term940, term940.getClass(), "right", 3.0);
        setField(term846, term846.getClass(), "labelInsets", term940);
        setDoubleField(term846, term846.getClass(), "labelAngle", 0.2641345529914265);
        setField(term846, term846.getClass(), "labelToolTip", "uuaPigETmJ");
        setField(term846, term846.getClass(), "labelURL", "MxlszYVzRf");
        setBooleanField(term846, term846.getClass(), "axisLineVisible", true);
        setFloatField(term991, term991.getClass(), "width", 1.0F);
        setIntField(term991, term991.getClass(), "join", 0);
        setIntField(term991, term991.getClass(), "cap", 2);
        setFloatField(term991, term991.getClass(), "miterlimit", 10.0F);
        setField(term991, term991.getClass(), "dash", null);
        setFloatField(term991, term991.getClass(), "dash_phase", 0.0F);
        setField(term846, term846.getClass(), "axisLineStroke", term991);
        setIntField(term997, term997.getClass(), "value", -8355712);
        setField(term997, term997.getClass(), "frgbvalue", null);
        setField(term997, term997.getClass(), "fvalue", null);
        setFloatField(term997, term997.getClass(), "falpha", 0.0F);
        setField(term997, term997.getClass(), "cs", null);
        setField(term846, term846.getClass(), "axisLinePaint", term997);
        setBooleanField(term846, term846.getClass(), "tickLabelsVisible", true);
        setField(term1001, term1001.getClass(), "fRequestedAttributes", null);
        setField(term1001, term1001.getClass(), "name", "SansSerif");
        setIntField(term1001, term1001.getClass(), "style", 0);
        setIntField(term1001, term1001.getClass(), "size", 10);
        setFloatField(term1001, term1001.getClass(), "pointSize", 10.0F);
        setField(term1001, term1001.getClass(), "peer", null);
        setLongField(term1001, term1001.getClass(), "pData", 0L);
        setField(term1001, term1001.getClass(), "font2DHandle", null);
        setField(term1001, term1001.getClass(), "values", null);
        setBooleanField(term1001, term1001.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1001, term1001.getClass(), "createdFont", false);
        setBooleanField(term1001, term1001.getClass(), "nonIdentityTx", false);
        setIntField(term1001, term1001.getClass(), "hash", 0);
        setIntField(term1001, term1001.getClass(), "fontSerializedDataVersion", 1);
        setField(term1001, term1001.getClass(), "flmref", null);
        setField(term846, term846.getClass(), "tickLabelFont", term1001);
        setField(term846, term846.getClass(), "tickLabelPaint", term937);
        setField(term1022, term1022.getClass(), "unitType", term941);
        setDoubleField(term1022, term1022.getClass(), "top", 2.0);
        setDoubleField(term1022, term1022.getClass(), "left", 4.0);
        setDoubleField(term1022, term1022.getClass(), "bottom", 2.0);
        setDoubleField(term1022, term1022.getClass(), "right", 4.0);
        setField(term846, term846.getClass(), "tickLabelInsets", term1022);
        setBooleanField(term846, term846.getClass(), "tickMarksVisible", false);
        setFloatField(term846, term846.getClass(), "tickMarkInsideLength", 0.8783184F);
        setFloatField(term846, term846.getClass(), "tickMarkOutsideLength", 2.0F);
        setFloatField(term1030, term1030.getClass(), "width", 1.0F);
        setIntField(term1030, term1030.getClass(), "join", 0);
        setIntField(term1030, term1030.getClass(), "cap", 2);
        setFloatField(term1030, term1030.getClass(), "miterlimit", 10.0F);
        setField(term1030, term1030.getClass(), "dash", null);
        setFloatField(term1030, term1030.getClass(), "dash_phase", 0.0F);
        setField(term846, term846.getClass(), "tickMarkStroke", term1030);
        setField(term846, term846.getClass(), "tickMarkPaint", term997);
        setDoubleField(term846, term846.getClass(), "fixedDimension", 0.36923381893433327);
        setField(term846, term846.getClass(), "plot", null);
        setField(term1037, term1037.getClass(), "listenerList", term1038);
        setField(term846, term846.getClass(), "listenerList", term1037);
        term1039 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.jfree.chart.axis.CategoryAxis");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term844;
        args[1] = term846;
        args[2] = term1039;
        try {
            callMethod(klass, "setDomainAxis", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


