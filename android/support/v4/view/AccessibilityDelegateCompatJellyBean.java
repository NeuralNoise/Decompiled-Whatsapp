package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

class AccessibilityDelegateCompatJellyBean {

    public interface AccessibilityDelegateBridgeJellyBean {
        boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        Object getAccessibilityNodeProvider(View view);

        void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        void onInitializeAccessibilityNodeInfo(View view, Object obj);

        void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent);

        boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        boolean performAccessibilityAction(View view, int i, Bundle bundle);

        void sendAccessibilityEvent(View view, int i);

        void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent);
    }

    final class 1 extends AccessibilityDelegate {
        final AccessibilityDelegateBridgeJellyBean val$bridge;

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.val$bridge.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.val$bridge.performAccessibilityAction(view, i, bundle);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.val$bridge.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.val$bridge.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.val$bridge.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.val$bridge.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.val$bridge.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            return (AccessibilityNodeProvider) this.val$bridge.getAccessibilityNodeProvider(view);
        }

        1(AccessibilityDelegateBridgeJellyBean accessibilityDelegateBridgeJellyBean) {
            this.val$bridge = accessibilityDelegateBridgeJellyBean;
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.val$bridge.sendAccessibilityEvent(view, i);
        }
    }

    public static Object newAccessibilityDelegateBridge(AccessibilityDelegateBridgeJellyBean accessibilityDelegateBridgeJellyBean) {
        return new 1(accessibilityDelegateBridgeJellyBean);
    }

    public static boolean performAccessibilityAction(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }

    public static Object getAccessibilityNodeProvider(Object obj, View view) {
        return ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }
}
